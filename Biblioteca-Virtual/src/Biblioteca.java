import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Ebook> ebooks;
    ArrayList<Emprestimo> emprestimos;

    Biblioteca() {
        this.ebooks = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    void adicionarEbook(Ebook ebook) {
        ebooks.add(ebook);
    }

    void mostrarEbooksDisponiveis() {
        System.out.println("Ebooks disponíveis:");
        for (Ebook ebook : ebooks) {
            if (!ebook.emprestado) {
                ebook.mostrarEbook();
            }
        }
    }

    void emprestarEbook(int isbn, Usuario usuario) {
        for (Ebook ebook : ebooks) {
            if (ebook.isbn == isbn && !ebook.emprestado) {
                ebook.emprestado = true;
                emprestimos.add(new Emprestimo(ebook, usuario));
                System.out.println("Ebook emprestado com sucesso!");
                return;
            }
        }
        System.out.println("Ebook não encontrado ou já emprestado.");
    }

    void devolverEbook(int isbn) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.ebook.isbn == isbn) {
                emprestimo.ebook.emprestado = false;
                emprestimos.remove(emprestimo);
                System.out.println("Ebook devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Ebook não encontrado nos empréstimos.");
    }
}