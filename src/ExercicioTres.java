import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args){
        /* 3-Faça um algoritmo que leia dois valores inteiros A e B,
        se os valores de A e B forem iguais, deverá somar os dois valores,
        caso contrário devera multiplicar A por B.
        Ao final de qualquer um dos cálculos deve-se atribuir o resultado
        a uma variável C e imprimir seu valor na tela.*/

        int A;
        int B;
        int calculo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        B = scanner.nextInt();

        if (A == B){
            calculo = A + B;
            System.out.println("Os valores " +A+ " e " +B+ " são iguais. A soma entre eles resulta em: " +calculo+ ".");
        } else{
            calculo = A * B;
            System.out.println("Os valores " +A+ " e " +B+ " são diferentes. A múltiplicação entre eles resulta em: " +calculo+ ".");
        }
        scanner.close();
    }
}
