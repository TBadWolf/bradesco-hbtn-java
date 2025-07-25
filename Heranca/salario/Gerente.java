public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        //se é gerente, o bonus é 20% em cima do salário se departamento atingiu a meta + 1% da 
        //diferença entre o resultado alcançado pelo departamento e qual era a meta
        double valorBonus = 0;
        double valorDifMeta = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
        
        if(departamento.alcancouMeta()){
            valorBonus = getSalarioFixo() * 0.2;
            valorBonus += (valorDifMeta * 0.01);
        }
        return valorBonus;
    }
    
}
