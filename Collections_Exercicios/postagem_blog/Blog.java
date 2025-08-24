import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new java.util.ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        for (Post p : postagens) {
            if (p.getTitulo().equals(post.getTitulo()) && p.getAutor().equals(post.getAutor())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        this.postagens.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : postagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public java.util.Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<>();
        for (Post post : postagens) {
            Categorias categoria = post.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsPorAutor = new TreeSet<>();
        for (Post post : postagens) {
            if (post.getAutor().equals(autor)) {
                postsPorAutor.add(post);
            }
        }
        return postsPorAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsPorCategoria = new TreeSet<>();
        for (Post post : postagens) {
            if (post.getCategoria() == categoria) {
                postsPorCategoria.add(post);
            }
        }
        return postsPorCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategoria = new TreeMap<>();
        for (Post post : postagens) {
            Categorias categoria = post.getCategoria();
            postsPorCategoria.putIfAbsent(categoria, new TreeSet<>());
            postsPorCategoria.get(categoria).add(post);
        }
        return postsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new TreeMap<>();
        for (Post post : postagens) {
            Autor autor = post.getAutor();
            postsPorAutor.putIfAbsent(autor, new TreeSet<>());
            postsPorAutor.get(autor).add(post);
        }
        return postsPorAutor;
    }
}
