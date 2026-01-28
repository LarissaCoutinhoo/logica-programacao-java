public class ExpressoesComparativas {
    public static void main(String[] args){

        double carteiraUm = 2.500;
        double carteiraDois = 2.000;
        System.out.println(carteiraUm == carteiraDois);
        System.out.println(carteiraUm != carteiraDois);
        System.out.println(carteiraUm > carteiraDois);
        System.out.println(carteiraUm < carteiraDois);
        System.out.println(carteiraUm >= carteiraDois);
        System.out.println(carteiraUm <= carteiraDois); //comparando variáveis tipo double

        // NÃO É RECOMENDADO PARA STRINGS.
        // == e != EM ALGUNS CASOS RETORNAM CERTO, MAS NEM SEMPRE.
        // NÃO É RECOMENDADO! PARA COMPARAR STRINGS USE equals()
    }
}