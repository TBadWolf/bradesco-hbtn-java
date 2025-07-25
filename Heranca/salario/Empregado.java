public class Empregado {
    private double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
       double valorBonus = 0;
        //se não é gerente, o bonus é 10% acima do salario se o departamento atingiu a meta
       if(departamento.alcancouMeta()){
        valorBonus = salarioFixo * 0.1;
       }

       return valorBonus;
    }

    public double calcularSalarioTotal(Departamento departamento){
        return salarioFixo + calcularBonus(departamento);
    }
}
