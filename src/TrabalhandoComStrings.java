public class TrabalhandoComStrings {
    public static void main(String[] args){
        String musica = "Falling";
        String musicaFavorita = "Fine Line";
        String cantor = "Harry Edward Styles";
        String nome = "Iara";

        System.out.println("As músicas " +musica+" e " +musicaFavorita+ " são do cantor " +cantor+ ".");
        // Exemplo de Concatenação
        // IMPORTANTE: O operador + aparece sempre antes e após a variável a ser concatenada (somente se
        // houver algo mais a ser acrescentado) -> "olá " +nome+ "!";
        System.out.println("Olá " +nome+ "!");

        //Podemos medir o tamanho da String usando .lenth();
        int tamanhoString = nome.length();
        System.out.println("Iara seu nome possui " +tamanhoString+ " caracteres."); // com variável para o tamanho
        System.out.println("Iara seu nome possui " + nome.length() + " caracteres."); // sem variável para o tamanho

        //Podemos comparar se as Strings são iguais usando .equals();
        boolean saoIguais = musica.equals(musicaFavorita);
        System.out.println("A música e a música favorita são iguais: " +saoIguais);

        //Transformar a String em maiúsculo .toUpperCase()
        //Transformar a String em minúsculo .toLowerCase()
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

        //Concat, é usado para concatenar Strings mas não é tão usual, pois ele apenas junta tudo,
        // sem espaços e etc.
        String meuNome = "Larissa";
        String meuSobrenome = "Coutinho";
        String nomeCompleto = meuNome.concat(meuSobrenome);

        System.out.println("Meu nome completo é: " +nomeCompleto);

        //isEmpty(); Verifica se a String está vazia, sem caracteres. Espaço conta como caractere.
        String texto = "";
        System.out.println("O texto está vazio: " +texto.isEmpty());

        //isBlank(); Verifica se a String está vazia, sem caracateres visíveis. Espaço não conta como caractere.
        //isBlank(); é mais inteligente
        String palavra = "";
        System.out.println(palavra.isBlank());

    }
}
