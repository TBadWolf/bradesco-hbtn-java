import provedores.Frete;

public class Pedido {
    private int codigo;
    private double peso;
    private double total;
    private Frete frete;

    public int getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public double getTotal() {
        return total;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public Pedido(int codigo, double peso, double total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

}
