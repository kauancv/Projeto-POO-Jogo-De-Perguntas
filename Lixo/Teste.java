package Lixo;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {
    public static void main(String[] args) {

        ArrayList <String> perguntas = new ArrayList<>(); 
        ArrayList <Integer> numeros = new ArrayList<>();
        ArrayList <String> alternativasCorretas = new ArrayList<>();

        for (int i = 0; i < 3; i++){ // preenchendo o arrayList com 10 numeros
            numeros.add(i);
        }
       
       Collections.shuffle(numeros); // embaralha os numeros dentro do arrayList onde vai mudar a posicao em que estava
       
       System.out.println(numeros);

       perguntas.add("A -O que é encapsulamento em Java?\na) Um método que não pode ser acessado fora da classe.\n" + 
                 "b) O processo de ocultar detalhes internos de uma classe e fornecer uma interface pública.\n"+ 
                 "c) Um tipo de loop em Java.\n" + 
                 "b) d) Uma classe abstrata em Java.\n");
       
                 alternativasCorretas.add("A");

       perguntas.add("D - Qual é a diferença entre uma classe e um objeto?\na)  Uma classe é um tipo de referência, enquanto um objeto é um tipo primitivo.\n" + 
                 "b) Uma classe é um conjunto de atributos e métodos, enquanto um objeto é um conjunto de valores.\n"+ 
                 "c) Uma classe é um tipo de dados, enquanto um objeto é um valor.\n" + 
                 "d)Uma classe é uma abstração de um conceito do mundo real, enquanto um objeto é uma instância de uma classe.\n");

       alternativasCorretas.add("D");
       
       perguntas.add("B -Qual é o objetivo de um construtor?\na)Inicializar os atributos de um objeto.\n" + 
                 "b)Criar um novo objeto.\n"+ 
                 "c)Destruir um objeto.\n" + 
                 "d)Modificar os atributos de um objeto.\n");

       alternativasCorretas.add("B");
      
               
       for (int i = 0; i < 3; i++){
      //  System.out.println(perguntas.get(numeros.get(i)));
        System.out.printf(alternativasCorretas.get(numeros.get(i)));
       }
        int i = 0;
        System.out.println();
       while (i < perguntas.size()){
      //   System.out.println(perguntas.get(numeros.get(i)));
         System.out.printf(alternativasCorretas.get(numeros.get(i)));
         i++;
       }

        
    }
}
