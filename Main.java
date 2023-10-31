public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Kauan");
        
        JogoIniciar jogo = new JogoIniciar();

        jogo.inicializarJogo(jogador);

    }
}
