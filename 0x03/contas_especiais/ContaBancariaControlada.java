public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo,
            double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();
        if (getSaldo() < saldoMinimo) {
            setSaldo(getSaldo() - valorPenalidade);
        }
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public double getValorPenalidade() {
        return valorPenalidade;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public void setValorPenalidade(double valorPenalidade) {
        this.valorPenalidade = valorPenalidade;
    }

    

}
