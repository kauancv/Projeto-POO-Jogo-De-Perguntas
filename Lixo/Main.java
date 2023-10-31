/* import Jogador;

package Lixo;
public class Main {
    public static void main(String[] args) {
        P[] perguntas = new P[2];
        Jogador j1 = new Jogador("Kauan");
        String opcao = "a";
        String[] alternativas = new String[10]; 
       
        alternativas[0] = "a) Um método que não pode ser acessado fora da classe.\r\n" + 
                "b) O processo de ocultar detalhes internos de uma classe e fornecer uma interface pública.\r\n" + 
                "c) Um tipo de loop em Java.\r\n" + 
                "d) Uma classe abstrata em Java.\n";

        perguntas[0] = new P("O que é encapsulamento em Java?", alternativas[0], "A");
        
        System.out.println( perguntas[0].getPergunta());
        System.out.println( perguntas[0].getAlternativas());
        System.out.println();
        System.out.println( perguntas[0].getRespostaCorreta());
        if (opcao.equalsIgnoreCase(perguntas[0].getRespostaCorreta())){
            System.out.println("Resposta correta");
             j1.setPontuacao(j1.getPontuacao() + 10);
        }

        System.out.println(j1.getPontuacao());

    }
}
 */