public class Post implements Comparable<Post> {
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public String getTitulo() {
        return titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int compareTo(Post o) {
        int titleComparison = this.titulo.compareTo(o.titulo);
        if (titleComparison != 0) {
            return titleComparison;
        }
        return this.autor.getNome().compareTo(o.autor.getNome());
    }
}