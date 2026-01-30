import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args){
        /*2 - Faça um algoritmo para receber um número qualquer e imprimir
        na tela se o número é par ou ímpar, positivo ou negativo.*/

        boolean positivo;
        boolean par;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qualquer número e descubra se ele é par ou ímpar, positivo ou negativo.");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            par = true;
        } else{
            par = false;
        }

        if(numero > 0){
            positivo = true;
        } else{
            positivo = false;
        }

        if(par == true && positivo == true){
            System.out.println(numero+ " é um número par e positivo");
        } else if (par == false && positivo == false) {
            System.out.println(numero+ " é um número ímpar e negativo");
        } else if (par == true && positivo == false) {
            System.out.println(numero+ " é um número par e negativo");
        } else{
            System.out.println(numero+ " é um número ímpar e positivo");
        }
    }
}
