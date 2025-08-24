public class Tarefa {
    private String descricao;
    private int identificador;
    private boolean estahFeita;

    public Tarefa(String descricao, int identificador) {
        verificarDescricao(descricao);
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdentificador() {
        return identificador;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void modificarDescricao(String novaDescricao) {
        if (verificarDescricao(novaDescricao)) {
            this.descricao = novaDescricao;
        }
    }

    public boolean verificarDescricao(String descricao) {
        boolean descricaoOk = false;
        if (this.descricao == null || this.descricao.isEmpty()) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }else{
            descricaoOk = true;
        }
        return descricaoOk;
    }
}
