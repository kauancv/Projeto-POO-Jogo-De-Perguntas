package Versao1;

import java.util.ArrayList;

public class BancoDePerguntas {

    ArrayList<String> perguntas = new ArrayList<>();
    ArrayList<String> alternativasCorretas = new ArrayList<>();

    public void bancoDePerguntas(){
        perguntas.add("B - O que é encapsulamento em Java?\na) Um método que não pode ser acessado fora da classe.\n" + 
        "b) O processo de ocultar detalhes internos de uma classe e fornecer uma interface pública.\n"+ 
        "c) Um tipo de loop em Java.\n" + 
        "d) Uma classe abstrata em Java.\n");

        alternativasCorretas.add("B");
        
        perguntas.add("C - O que é encapsulamento em Java?\na) Um método que não pode ser acessado fora da classe.\n" + 
        "b) O processo de ocultar detalhes internos de uma classe e fornecer uma interface pública.\n"+ 
        "c) Um tipo de loop em Java.\n" + 
        "d) Uma classe abstrata em Java.\n");

        alternativasCorretas.add("C");
        
        perguntas.add("C - O que é encapsulamento em Java?\na) Um método que não pode ser acessado fora da classe.\n" + 
        "b) O processo de ocultar detalhes internos de uma classe e fornecer uma interface pública.\n"+ 
        "c) Um tipo de loop em Java.\n" + 
        "d) Uma classe abstrata em Java.\n");

        alternativasCorretas.add("D");
    }

    public String getPergunta (int posicao){
       return perguntas.get(posicao);
    }

    public String getAlternativa(int posicao) {
        return alternativasCorretas.get(posicao);
    }

    public int quantidadePerguntas(){
        return perguntas.size();
    }
    public int quantidadeAlternativas(){
        return alternativasCorretas.size();
    }
}
