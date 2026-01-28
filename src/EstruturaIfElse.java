public class EstruturaIfElse {
    public static void main(String[] args){

        int nota = 10;
        double nota2 = 9.8;
        double media = (nota + nota2) / 2;
        System.out.println(media);

        if (media >= 6){
            System.out.println("Parabéns, você foi aprovado!");
        }
        else{
            System.out.println("Você foi reprovado por nota insuficiente!");
        } //estrutura usando expressões comparativas



        boolean viajouNoNatal = true;
        boolean viajouNaPascoa = true;

        if (viajouNoNatal && viajouNaPascoa){
            System.out.println("Uau! você aproveitou o ano.");
        }
        else if (viajouNoNatal || viajouNaPascoa){
            System.out.println("Você fez uma viagem.");
        }
        else {
            System.out.println("Que pena! Você não viajou na páscoa e não viajou natal.");
        } // estrutura usando os operadores lógicos



        boolean voceCantor = true;

        if (!voceCantor){
            System.out.println("Você não é cantor");
        }
        else{
            System.out.println("Você é cantor");
        }// estrutura usando o operador lógico ! - de negação

    }
}
