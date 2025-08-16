import java.io.*;
import java.util.*;

public class Estoque {
    private List<Produto> produtos;
    private String arquivo;

    public Estoque(String arquivo) {
        this.arquivo = arquivo;
        carregarProdutos(arquivo);
    }

    private void carregarProdutos(String arquivo) {
        this.produtos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty())
                    continue;
                String[] campos = linha.split(",");
                if (campos.length != 4)
                    continue;
                try {
                    int id = Integer.parseInt(campos[0]);
                    String nome = campos[1];
                    int quantidade = Integer.parseInt(campos[2]);
                    double preco = Double.parseDouble(campos[3]);
                    produtos.add(new Produto(id, nome, quantidade, preco));
                } catch (NumberFormatException e) {
                    System.err.println("Exceção ao tratar números: " + e.getMessage());
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private void salvarProdutos(String arquivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Produto produto : produtos) {
                bw.write(produto.toCsv());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    private int gerarNovoId() {
        int maxId = 0;
        for (Produto produto : produtos) {
            if (produto.getId() > maxId)
                maxId = produto.getId();
        }
        return maxId + 1;
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        int id = gerarNovoId();
        Produto novoProduto = new Produto(id, nome, quantidade, preco);
        produtos.add(novoProduto);
        salvarProdutos(this.arquivo);
    }

    public void excluirProduto(int id) {
        boolean removido = produtos.removeIf(p -> p.getId() == id);
        if (removido) {
            salvarProdutos(this.arquivo);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            return;
        }
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void atualizarQuantidade(int id, int novaQuantidade) {
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setQuantidade(novaQuantidade);
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            salvarProdutos(this.arquivo);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}