package Gerador;


import java.util.ArrayList;
import java.util.Collections;

public class Gerador{

    public static void main(String[] args){
      ArrayList <Integer> numeros = new ArrayList<>();
      ArrayList <String> perguntas = new ArrayList<>();

      numeros.add(0);
      numeros.add(1);
      numeros.add(2);
      numeros.add(3);
      numeros.add(4);
     // numeros.add(5); erro 

      System.out.println("Ordem Normal");
      System.out.println(numeros);
      
       Collections.shuffle(numeros);
        System.out.println("Apos Aleatorizar");
       System.out.println(numeros);

       perguntas.add("Pergunta 1");
       perguntas.add("Pergunta 2");
       perguntas.add("Pergunta 3");
       perguntas.add("Pergunta 4");
       perguntas.add("Pergunta 5");
       
       for (int i = 0; i < perguntas.size(); i++){
        System.out.println(perguntas.get(numeros.get(i)));
       }
        

       

    }
}