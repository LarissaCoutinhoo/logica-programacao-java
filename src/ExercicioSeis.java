import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args){
        /* 6- Um sistema de atendimento telefônico pede para o usuário digitar
         um número de 1 a 4, onde:
         1 representa Suporte Técnico,
         2 representa Financeiro,
         3 representa Vendas,
         4 representa Ouvidoria.
         Mostre na tela a área correspondente à opção escolhida.
         Caso o usuário digite um número que não esteja entre 1 e 4,
         informe que a opção é inválida. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao atendimento da LuarCell!");
        System.out.println("Digite:\n 1 para Suporte Técnico\n 2 para Financeiro\n 3 para Vendas\n 4 para Ouvidoria");

        int atendimento = scanner.nextInt();

        switch (atendimento){
            case 1:
                System.out.println("Olá, sou a Maria, técnica de suporte da LuarCell. Como posso te ajudar?");
                break;
            case 2:
                System.out.println("Olá, sou a Camila, representante financeira da LuarCell. Como posso te ajudar?");
                break;
            case 3:
                System.out.println("Olá, sou a Patrícia, representante de vendas da LuarCell. Como posso te ajudar?");
                break;
            case 4:
                System.out.println("Olá, sou o Pedro, da ouvidoria da LuarCell. Como posso te ajudar?");
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
                break;
        }
        scanner.close();
    }
}
