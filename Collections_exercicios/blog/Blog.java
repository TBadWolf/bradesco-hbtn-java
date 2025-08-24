import java.util.List;
import java.util.Set;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new java.util.ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        this.postagens.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new java.util.HashSet<>();
        for (Post post : postagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public java.util.Map<String, Integer> obterContagemPorCategoria() {
        java.util.Map<String, Integer> contagem = new java.util.HashMap<>();
        for (Post post : postagens) {
            String categoria = post.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }
}
