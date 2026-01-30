import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args){
        //1 - Faça um algoritmo que leia os valores de A, B, C
        // e em seguida imprima na tela a soma entre A e B
        // e mostre se a soma é menor que C.

        int A;
        int B;
        int C;
        int soma;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        B = scanner.nextInt();
        System.out.println("Digite o valor de C: ");
        C = scanner.nextInt();

        soma = A + B;
        System.out.println("A soma dos valores de A + B é igual a "+soma+".");

        if (soma < C){
            System.out.println(soma+ " é menor do que " +C+ ".");
        } else {
            System.out.println(soma+ " é maior ou igual a " +C+ ".");
        }

        scanner.close();
    }
}
