import java.util.Scanner;

public class ExercicioOito {
    public static void main (String[] args){
        /* 8- Peça ao usuário para digitar várias notas (valores inteiros de 0 a 10).
        O programa deve continuar pedindo notas enquanto o valor digitado estiver entre 0 e 10.
        Quando o usuário digitar um valor inválido (menor que 0 ou maior que 10), o programa deve parar.
        Ao final, mostre quantas notas válidas foram digitadas e a soma dessas notas.
        (A nota inválida não entra na contagem nem na soma).
        */

        Scanner scanner = new Scanner(System.in);
        int nota;
        int contadorNotas = 0;
        int total = 0;

        do{
            System.out.println("Digite uma nota entre 0 e 10");
            nota = scanner.nextInt();
            if(nota >= 0 && nota <=10){
                contadorNotas ++;
                total = total + nota;
            }
        }while(nota >= 0 && nota <=10);

        System.out.println("Você digitou " +contadorNotas+ " notas. A soma entre elas resulta em " +total+ ".");
        scanner.close();
    }
}
