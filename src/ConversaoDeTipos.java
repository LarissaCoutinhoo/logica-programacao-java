public class ConversaoDeTipos {
    public static void main(String[] args) {

        int num = 2;
        double numConvertido = num;
        System.out.println(numConvertido);
        // conversão implicita, ocorre automaticamente
        // pois trata-se de um conversão de tipo, onde convertemos um tipo menor para um tipo maior
        // um tipo menor "cabe" um tipo maior


        double valorTotal = 105.50;
        int arredondado = (int) valorTotal;
        System.out.println("O valor total é " + valorTotal + " mas iremos arredondar para " + arredondado);
        // double é um tipo maior que int. por isso ao converter perdemos a parte decimal.
        // ao converter ficamos somente com a parte inteira.

        int resultado = (int) (2.5/3.5);
        System.out.println(resultado);
        // usamos o casting para converter o resultado da divisão para int
        // caso não queira usar o casting, precisaria usar o tipo double, apropriado para pontos flutuantes.

        String valor = "8";
        int valorConvertido = Integer.parseInt(valor);
        System.out.println(valorConvertido);
        // Integer.parseInt() recebe uma String que representa um número inteiro
        // e retorna esse valor como int
        // essa conversão NÃO é casting, pois String não é um tipo primitivo
        // para fazer o caminho inverso (int → String), usamos Integer.toString()

        int x = 4;
        String y = Integer.toString(x);
        System.out.println(y);

        double m = 4.50;
        String n = Double.toString(m);
        System.out.println(n);
    }
}
