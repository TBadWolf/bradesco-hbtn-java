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
            double precoLiquido = itensPedidos.getProduto().obterPrecoLiquido();
            int quantidade = itensPedidos.getQuantidade();
            valorTotalPedido += quantidade * precoLiquido;
        }
        double desconto = valorTotalPedido * (this.percentualDesconto / 100.0);
        return valorTotalPedido - desconto;
    }
}
