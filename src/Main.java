public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "1234567890");
        Membro membro = new Membro("João", 1, "joao@example.com");

        biblioteca.adicionarLivro(livro);
        biblioteca.registrarMembro(membro);

        biblioteca.emprestarLivro(livro, membro);

        System.out.println("Livro emprestado com sucesso para " + membro.nome);
    }
}