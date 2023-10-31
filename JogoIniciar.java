import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JogoIniciar {
    public void inicializarJogo(Jogador jogador){
      
        Scanner scan = new Scanner(System.in);

        ArrayList <String> perguntas = new ArrayList<>(); 
        ArrayList <Integer> numeros = new ArrayList<>();
        ArrayList <String> alternativasCorretas = new ArrayList<>();
        
        perguntas.add("B -O que é encapsulamento em Java?\na) Um método que não pode ser acessado fora da classe.\n" + 
                 "b) O processo de ocultar detalhes internos de uma classe e fornecer uma interface pública.\n"+ 
                 "c) Um tipo de loop em Java.\n" + 
                 "b) d) Uma classe abstrata em Java.\n");
       
                 alternativasCorretas.add("B");

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
       
       perguntas.add(" A - O que é uma herança?\na)É o processo de uma classe herdar os atributos e métodos de outra classe.\n" + 
                 "b)É o processo de uma classe estender outra classe.\n"+ 
                 "c)É o processo de uma classe implementar outra classe.\n" + 
                 "d)É o processo de uma classe substituir outra classe.\n");


       alternativasCorretas.add("A");
       
       perguntas.add("C - O que é um casting? \na)É o processo de converter um tipo de dados primitivo em um tipo de dados não primitivo.\n" + 
                 "b)É o processo de converter um tipo de dados primitivo em um tipo de dados não primitivo.\n"+ 
                 "c)É o processo de converter um tipo de dados não primitivo em um tipo de dados primitivo.\n" + 
                 "d)É o processo de converter um objeto em outro objeto.\n");
                
 
       alternativasCorretas.add("C");

       for (int i = 0; i < perguntas.size(); i++){ // preenchendo o arrayList com 10 numeros
        numeros.add(i);
    }
   
      Collections.shuffle(numeros); // embaralha os numeros dentro do arrayList onde vai mudar a posicao em que estava
   
      System.out.println(numeros);

      boolean erro = false;
      String opcao = null;
      int i = 0;
      int quantidadeErros = 0;

      while (erro == false && i < perguntas.size()){
        
        System.out.println(perguntas.get(numeros.get(i)));
        System.out.printf("Informe sua opcao:");
          opcao = scan.nextLine();

        if (opcao.equalsIgnoreCase(alternativasCorretas.get(numeros.get(i)))){
            System.out.printf("\nAcertou Monki\n");
             jogador.setPontuacao(jogador.getPontuacao() + 10);
             i++;
        }else {
            System.out.println("Errou Burrinho!!!");
            quantidadeErros ++;
            i++;
        }
        if (quantidadeErros == 2){
            erro = true;
        }


      }

      System.out.println("O jogador fez " + jogador.getPontuacao() + " pontos!!!");
      scan.close();
    }
    
}
