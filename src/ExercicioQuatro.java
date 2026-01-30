import java.util.Scanner;

public class ExercicioQuatro {
    public static void main (String[] args){
        /* 4- Faça um algoritmo que receba um número inteiro
        e imprima na tela o seu antecessor e o seu sucessor.
        */

        int numero;
        int antecessor;
        int sucessor;
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("O antecessor de " +numero+ " é "
                +antecessor+ ", o sucessor por sua vez é " +sucessor+ ".");

        scanner.close();
    }
}
