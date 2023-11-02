public class Cores {
    public static void main(String[] args) {
        // Códigos de escape ANSI para definir a cor da fonte
        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";

        // Exemplo de uso
        System.out.println("Texto normal");
        System.out.println(red + "Texto vermelho" + reset);
        System.out.println(green + "Texto verde" + reset);
        System.out.println(yellow + "Texto amarelo" + reset);
    }
}
