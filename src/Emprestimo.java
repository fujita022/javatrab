import java.time.LocalDate;

public class Emprestimo {
    Livro livro;
    Membro membro;
    LocalDate dataEmprestimo;

    public Emprestimo(Livro livro, Membro membro) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = LocalDate.now();
    }
}
