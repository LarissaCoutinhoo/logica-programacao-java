import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        int posicao = 2;

        switch (posicao) {
            case 1:
                System.out.println("Parabéns!!! Você é o campeão!");
                break;

            case 2:
                System.out.println("Você ficou em segundo lugar, isso é demais!");
                break;

            case 3:
                System.out.println("Você ficou em terceiro lugar e garantiu seu lugar no pódio, incrível!");
                break;

            default:
                System.out.println("Que pena! você não está classificado.");
                break;
        }

        // menu de opção
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite: 1 para Novo Pedido. 2 para Visualizar Pedidos. 3 para Sair");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Pode iniciar seu pedido");
                break;
            case 2:
                System.out.println("Você possui 3 pedidos em andamento e 1 concluído.");
                break;
            case 3:
                System.out.println("Você saiu.");
                break;
            default:
                System.out.println("Opção inexistente verifique e tente novamente :)");
                break;
        }
        scanner.close();
    }
}

