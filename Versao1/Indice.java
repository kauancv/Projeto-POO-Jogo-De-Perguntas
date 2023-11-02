package Versao1;

import java.util.ArrayList;
import java.util.Collections;

public class Indice {
    ArrayList <Integer> indices = new ArrayList<>();

    public void preecherIndices(int quantidadePerguntas){
        for (int i = 0; i < quantidadePerguntas; i++){
            indices.add(i);
        }
       
        Collections.shuffle(indices);

    }

    public int getIndice (int posicao){
        return indices.get(posicao);
    }

}
