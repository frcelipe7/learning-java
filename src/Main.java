public class Main {
    static void print(String showText) {
        System.out.println(showText);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.print("\n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   JFlix.com");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // print("Estou testando a minha funcão print()\nA função print tem a mesma função que o System.out.println()");

        // System.out.println("\nFilmes disponíveis:\n~ [1] Moana 2\n~ [2] Moana 3\n~ [3] Moana 4");
        print("\nFilmes disponíveis:\n~ [1] Moana 2\n~ [2] Moana 3\n~ [3] Moana 4");
        System.out.println("\nFilme escolhido: \"Moana 2\"");

        System.out.println("\n");
        for (int i = 0; i <= 100; i++) {
            System.out.print("\rBuscando informações... " + i + "%");
            Thread.sleep(70);

            if (i == 37) {
                Thread.sleep(625);
            } else if (i == 58) {
                Thread.sleep(725);
            } else if (i == 98) {
                Thread.sleep(2568);
            }
        }
        System.out.print("\rProcesso finalizado!\n________________\n");

        int anoDeLancamento = 2024;
        print("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
    }
}
