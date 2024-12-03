public class Main {
    static void print(String showText) {
        System.out.println(showText);
    }

    public static void main(String[] args) {
        System.out.print("\n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   JFlix.com");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // print("Estou testando a minha funcão print()\nA função print tem a mesma função que o System.out.println()");

        // System.out.println("\nFilmes disponíveis:\n~ [1] Moana 2\n~ [2] Moana 3\n~ [3] Moana 4");
        print("\nFilmes disponíveis:\n~ [1] Moana 2\n~ [2] Moana 3\n~ [3] Moana 4");
        System.out.println("\nFilme escolhido: ~ [1] Moana 2");

        int anoDeLancamento = 2024;
        print("Ano de lançamento: " + anoDeLancamento);
    }
}
