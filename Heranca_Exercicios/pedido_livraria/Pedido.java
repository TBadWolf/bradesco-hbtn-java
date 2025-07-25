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
}
