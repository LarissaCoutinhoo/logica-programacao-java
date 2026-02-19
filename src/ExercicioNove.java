import java.util.Scanner;

public class ExercicioNove {
    public static void main (String[] args){
        /* 9-Peça ao usuário um número inteiro.
            Mostre na tela a tabuada desse número, do 1 ao 10.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro");

        int numero = scanner.nextInt();
        int posicao;

        for(posicao = 1; posicao <= 10; posicao++){
            int resultado = numero * posicao;
            System.out.println(numero+ " x " +posicao+ " = " +resultado);
        }

        scanner.close();
        }
}
