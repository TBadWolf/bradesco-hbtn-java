public class Departamento {
    private double valorMeta;
    private double valorAtingidoMeta;


    public double getValorMeta(){
        return valorMeta;
    }

    public double getValorAtingidoMeta(){
        return valorAtingidoMeta;
    }

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public boolean alcancouMeta(){
        if(valorMeta >= valorAtingidoMeta){
            return true;
        }else{
            return false;
        }
    }
}
