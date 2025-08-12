package provedores;

public class Loggi implements ProvedorFrete {

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double taxa = 0.04;
        if (peso > 5000) {
            taxa = 0.12;
        }
        double custo = valor * taxa;
        return new Frete(custo, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
    
}
