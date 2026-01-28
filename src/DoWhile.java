import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String senha = "";
        do{
            System.out.println("Digite a senha para entrar");
            senha = scanner.nextLine();
            if (senha.equals("abcd")) {
                System.out.println("Você entrou!");
            }else {
                System.out.println("Incorreta, tente novamente");
            }
        }while(!senha.equals("abcd"));
    }
}

