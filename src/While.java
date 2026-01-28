import java.util.Scanner;

public class While {
    public static void main(String[] args){

        //while (true){
        //    System.out.println("Teste burro");
        //}



        int numero = 0;
        while (numero <= 10){
            System.out.println(numero);
            numero ++;
        } // contador



        String entrada = "";
        Scanner scanner = new Scanner(System.in);
        while(!entrada.equals("Quebrar maldição")){
            System.out.println("Bem-vindo ao looping infinito, digite 'Quebrar maldição' para sair.");
            entrada = scanner.nextLine();
        }// mudando a condição para false conforme entrada do usuário



        boolean gostoChocolate = true;
        while(gostoChocolate){
            System.out.println("Gosto de chocolate");
            System.out.println("Gosto de brigadeiro");
            gostoChocolate = false;
        }// mudando a condição para false diretamente

    }
}