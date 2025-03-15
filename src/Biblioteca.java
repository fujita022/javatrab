import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livros = new ArrayList<>();
    List<Membro> membros = new ArrayList<>();
    List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public void registrarMembro(Membro membro) {
        membros.add(membro);
    }

    public void emprestarLivro(Livro livro, Membro membro) {
        Emprestimo novoEmprestimo = new Emprestimo(livro, membro);
        emprestimos.add(novoEmprestimo); // Corrigido aqui
    }
}
