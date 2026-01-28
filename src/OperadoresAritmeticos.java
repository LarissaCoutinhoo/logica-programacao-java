public class OperadoresAritmeticos {
    public static void main (String[] args){
        double bolo = 12.50;
        double leite = 4.50;
        double capuccino = 13;
        double totalCompras;
        int desconto = 2;
        double totalComDesconto;
        double paraTresPessoas;
        double totalPorPessoa;

        totalCompras = bolo + leite + capuccino;
        totalComDesconto = totalCompras - desconto;
        paraTresPessoas = totalComDesconto * 3;
        totalPorPessoa = paraTresPessoas / 2;

        System.out.println("O total gasto foi: R$" +totalCompras);
        System.out.println("Ganhamos um desconto, o valor total atualizado é: R$" +totalComDesconto);
        System.out.println("O valor total do pedido triplicado com desconto é: R$" +paraTresPessoas);
        System.out.println("Dividiremos a conta entre dois, cada um deve pagar: R$" +totalPorPessoa);
    }
}