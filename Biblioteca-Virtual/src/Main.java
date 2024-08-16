import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarEbook(new Ebook("Java Programming", "John Doe", 29.99, 12345));
        biblioteca.adicionarEbook(new Ebook("Python Basics", "Jane Smith", 19.99, 67890));
        biblioteca.adicionarEbook(new Ebook("C++ Essentials", "Mike Johnson", 24.99, 11223));

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Bem vindo à nossa Biblioteca Virtual!");
            System.out.println("------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Ver ebooks disponíveis");
            System.out.println("2 - Emprestar um ebook");
            System.out.println("3 - Devolver um ebook");
            System.out.println("0 - Sair \n\n");



            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    biblioteca.mostrarEbooksDisponiveis();
                    break;
                case 2:
                    System.out.print("Digite o ISBN do ebook que deseja emprestar: ");
                    int isbnEmprestimo = scanner.nextInt();
                    System.out.print("Digite seu nome: ");
                    scanner.nextLine();
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Digite seu CPF: ");
                    float cpfUsuario = scanner.nextFloat();
                    Usuario usuario = new Usuario(nomeUsuario, cpfUsuario);
                    biblioteca.emprestarEbook(isbnEmprestimo, usuario);
                    break;
                case 3:
                    System.out.print("Digite o ISBN do ebook que deseja devolver: ");
                    int isbnDevolucao = scanner.nextInt();
                    biblioteca.devolverEbook(isbnDevolucao);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}