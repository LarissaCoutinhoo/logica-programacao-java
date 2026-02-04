import java.util.Scanner;

public class ExercicioSete {
    public static void main (String[] args) {
        /* 7- Peça ao usuário para digitar vários números inteiros.
        O programa deve continuar pedindo números enquanto o valor digitado for diferente de zero.
        Ao final, mostre quantos números foram digitados (o zero não entra na contagem).*/

        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;

        do{
            System.out.println("Digite um número inteiro. (0 para sair)");
            numero = scanner.nextInt();
                if(numero != 0){
                    contador++;
                }
        } while(numero != 0);

        System.out.println("Você digitou " +contador+ " número(s).");
        scanner.close();
    }
}
