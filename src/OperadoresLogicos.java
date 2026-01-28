public class OperadoresLogicos {
    public static void main(String[] args){
        // && - E - AND: ambos precisam ser verdadeiros para retornar true
        // || - OU - OR: pelo menos um verdadeiro já retorna true
        // ! - NÃO - NOT: inverte o valor lógico -> true passa para false e vice-versa

        boolean choveu = true;
        boolean calor = false;
        System.out.println(choveu && calor);
        System.out.println(choveu || calor);
        System.out.println(!choveu);
        System.out.println(!calor);
    }
}
