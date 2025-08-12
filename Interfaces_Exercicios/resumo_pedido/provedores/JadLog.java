package provedores;

public class JadLog implements ProvedorFrete {

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double taxa = 0.045;
        if (peso > 2000) {
            taxa = 0.07;
        }
        double custo = valor * taxa;
        return new Frete(custo, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
    
}
