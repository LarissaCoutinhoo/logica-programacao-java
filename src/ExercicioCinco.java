import java.util.Scanner;

public class ExercicioCinco {
    public static void main (String[] args){
        /* 5- Faça um algoritmo que receba o valor do salário mínimo
        e leia o valor do salário de um usuário, calcule quantos salários
        mínimos esse usuário ganha e imprima na tela o resultado.
        (Base para o Salário mínimo R$ 1.293,20).
        */

        double salarioMinimo = 1293.20;
        double salario;
        double qtdSalMin;

        System.out.println("Digite o valor do seu salário: ");
        Scanner scanner = new Scanner(System.in);
        salario = scanner.nextDouble();

        qtdSalMin = salario / salarioMinimo;

        System.out.printf("Seu salário equivale a %.2f salários mínimos. %n" ,qtdSalMin);
        scanner.close();
    }
}
