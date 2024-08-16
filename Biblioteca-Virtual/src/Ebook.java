
public class Ebook {
    String nome;
    String autor;
    Double valor;
    int isbn;
    boolean emprestado;

    Ebook(String nome, String autor, Double valor, int isbn) {
        this.nome = nome;
        this.autor = autor;
        this.valor = valor;
        this.isbn = isbn;
        this.emprestado = false;
    }

    void mostrarEbook() {
        System.out.println("---------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Estado: " + (emprestado ? "Livro emprestado" : "Disponível para emprestimo\n"));
    }
}
