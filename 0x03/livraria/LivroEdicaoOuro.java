import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro {

    public LivroEdicaoOuro(String titulo, String autor, Double preco)
            throws LivroInvalidoException, AutorInvalidoException {
        super(titulo, autor, preco);
    }

    @Override
    public Double getPreco() {
        return (super.getPreco() * 1.3);
    }
}
