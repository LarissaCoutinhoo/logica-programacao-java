import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
    public static void main (String[] args){

        // definindo se um número é par ou ímpar
        int numero = 10;
        int resto = numero % 2;
        String parImpar = (resto == 0)? "Par" : "Ímpar";
        System.out.println(parImpar);

        // aplicando um desconto
        double preco = 169.90;
        double valorComDesconto = (preco >= 150)? (preco - 10.00) : preco;
        System.out.println(valorComDesconto);

        //desconto em porcentagem
        double valor = 300.00;
        double valorComDesconto2 = (valor >= 200)? valor * 0.85 : valor;
        System.out.println(valorComDesconto2);
        // Para aplicar desconto em porcentagem
        // subtraímos o desconto de 100% e multiplicamos o valor pelo que sobra
        // Ex: 15% de desconto → 100 - 15 = 85% → valor * 0.85

        // desafio com entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        double valorProduto = scanner.nextDouble();
        System.out.println("Digite a quantidade que você comprou");
        int quantidade = scanner.nextInt();
        double valorTotal = valorProduto * quantidade;

        double valorTotalComDesconto = (valorTotal >= 300)? valorTotal * 0.80 : valorTotal;
        System.out.println("O valor total sem desconto é: R$" +valorTotal+ ".");
        System.out.println("O valor após a aplicação do desconto é: R$" +valorTotalComDesconto);

        scanner.close();
    }
}
