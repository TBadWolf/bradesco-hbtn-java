package provedores;

public class Frete {
    private double valor;
    private TipoProvedorFrete tipoProvedorFrete;

    public double getValor() {
        return valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipoProvedorFrete(TipoProvedorFrete tipoProvedorFrete) {
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public Frete(double valor, TipoProvedorFrete tipoProvedorFrete) {
        this.valor = valor;
        this.tipoProvedorFrete = tipoProvedorFrete;
    }
}
