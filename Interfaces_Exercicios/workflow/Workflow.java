import java.util.ArrayList;
import java.util.List;

import atividades.Atividade;

public class Workflow {
    private List<Atividade> atividades;

    public Workflow() {
        this.atividades = new ArrayList<>();
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public void registrarAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }
}
