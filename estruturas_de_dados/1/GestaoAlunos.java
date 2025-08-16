import java.util.ArrayList;

public class GestaoAlunos {
    private ArrayList<Aluno> alunos;

    public GestaoAlunos() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void excluirAluno(Aluno aluno) {
        Aluno alunoEncontrado = buscarAluno(aluno.getNome());
        if (alunoEncontrado != null) {
            this.alunos.remove(aluno);
            return;
        }
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public Aluno buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }
}
