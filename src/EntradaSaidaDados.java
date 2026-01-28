import java.util.Scanner;

public class EntradaSaidaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua cor favorita: ");
        String cor = scanner.nextLine();
        System.out.println("Sua cor favorita é " + cor);
        System.out.println("Digite seu número da sorte: ");
        int numeroDaSorte = scanner.nextInt();
        System.out.println("Sua cor favorita é " + cor + " e seu número da sorte é o " + numeroDaSorte);
        System.out.println("Você é feliz? Para sim digite 'True', para não :/, digite 'False'");
        boolean feliz = scanner.nextBoolean();
        System.out.println("Você é feliz: " +feliz);
    }
}
