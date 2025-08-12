package provedores;

public class Sedex implements ProvedorFrete {

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double taxa = 0.05;
        if (peso > 1000) {
            taxa = 0.1;

        }
        double custo =  valor * taxa;
        return new Frete(custo, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }

    
}
