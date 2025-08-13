import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
    private String titulo;
    private String autor;
    private double  preco;

    public Livro(String titulo, String autor, double  preco) throws AutorInvalidoException, LivroInvalidoException {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if(titulo == null || titulo.isEmpty() || titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        if(autor == null || autor.isEmpty() || autor.trim().split("\\s+").length < 2) {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }

    public void setPreco(Double preco) throws LivroInvalidoException  {
        if (preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Double  getPreco() {
        return preco;
    }

}
