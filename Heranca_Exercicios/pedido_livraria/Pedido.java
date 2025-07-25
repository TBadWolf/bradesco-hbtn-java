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
        double valorTotalPedido = 0;
        for(ItemPedido itensPedidos: itens){
            valorTotalPedido += (itensPedidos.getQuantidade() * itensPedidos.getProduto().obterPrecoLiquido());
        }
        double desconto = valorTotalPedido * (this.percentualDesconto/100);
        return valorTotalPedido - desconto;
    }
}
