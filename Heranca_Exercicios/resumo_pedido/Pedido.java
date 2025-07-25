import produtos.Produto;
import produtos.Livro;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double calcularTotal() {
        double valorTotalPedido = 0.0;
        for (ItemPedido itensPedidos : itens) {
            valorTotalPedido += itensPedidos.getProduto().obterPrecoLiquido() * itensPedidos.getQuantidade();
        }
        double desconto = valorTotalPedido * (percentualDesconto / 100.0);
        return valorTotalPedido - desconto;
    }

    public void apresentarResumoPedido() {
        double precoTotalCompra = 0.0;
        System.out.println("------- RESUMO PEDIDO -------");

        for (ItemPedido item : itens) {
            Produto produto = item.getProduto();
            double precoTotal = produto.obterPrecoLiquido() * item.getQuantidade();
            precoTotalCompra += precoTotal;

            String tipo = produto instanceof Livro ? "Livro" : "Dvd";
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                    tipo,item.getProduto().getTitulo(),item.getProduto().obterPrecoLiquido(),item.getQuantidade(),precoTotal);
        }

        double descontoTotal = precoTotalCompra * (percentualDesconto / 100.0);
        double totalPagar = precoTotalCompra - descontoTotal;
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", descontoTotal);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", precoTotalCompra);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", totalPagar);
        System.out.println("----------------------------");
    }
}
