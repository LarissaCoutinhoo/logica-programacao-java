import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        /* Peça ao usuário um número inteiro positivo e
         mostre na tela uma contagem regressiva até 0. */

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um número inteiro positivo");
            numero = scanner.nextInt();
        } while (numero <= 0);

        for (;numero >= 0; numero--) {
            System.out.println(numero);
        }
    }
}
