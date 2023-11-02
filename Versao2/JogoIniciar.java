package Versao2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JogoIniciar {
    public void inicializarJogo(Jogador jogador){
       
       String reset = "\u001B[0m";
       String red = "\u001B[31m";
       String green = "\u001B[32m";
       
        Scanner scan = new Scanner(System.in);
 
        ArrayList <String> perguntas = new ArrayList<>();
        ArrayList <Integer> numeros = new ArrayList<>();
        ArrayList <String> alternativasCorretas = new ArrayList<>();
        
        perguntas.add("B - O que é encapsulamento em Java?\na) Um método que não pode ser acessado fora da classe.\n" + 
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
       
       perguntas.add("A - O que é uma classe?\na)Um conjunto de atributos\n" + 
                 "b)Um tipo de dados\n"+ 
                 "c)Um conjunto de métodos\n" + 
                 "d)Um objeto\n");
             
                 
 
       alternativasCorretas.add("A");
       
       perguntas.add("D - O que é um método estático?\na)Um método que pode ser chamado sem a necessidade de uma instância de classe\n" + 
                 "b)Um método que pode ser chamado apenas a partir de uma instância de classe\n"+ 
                 "c)Um método que pode acessar apenas atributos estáticos\n" + 
                 "d)Um método que pode ser acessado por qualquer classe\n");
                 
 
       alternativasCorretas.add("D");
       
       
       perguntas.add(" A -O que é um método virtual?\na)Um método que pode ser substituído por uma subclasse\n" + 
                 "b)Um método que é chamado dinamicamente\n"+ 
                 "c)Um método que pode ser chamado a partir de uma classe abstrata\n" + 
                 "d)Um método que pode ser chamado a partir de um objeto\n");

               
 
       alternativasCorretas.add("A");
        
       perguntas.add("B - Qual é o tipo de relacionamento entre uma classe e sua subclasse?\na)Associação\n" + 
                 "b)Herança\n"+ 
                 "c)Agregação\n" + 
                 "d)Composição\n");
                
 
       alternativasCorretas.add("B");
       
       perguntas.add("D - Qual é a diferença entre herança e composição\na)Herança é uma relação unidirecional, enquanto composição é uma relação bidirecional.\n" + 
                 "b)Herança é uma relação entre classes, enquanto composição é uma relação entre objetos.\n"+ 
                 "c)Herança permite que uma classe herde atributos e métodos de outra classe, enquanto composição permite que uma classe use objetos de outra classe como seus atributos.\n" + 
                 "d)Todas as respostas estão corretas.\n");
                
 
       alternativasCorretas.add("D");
        
       for (int i = 0; i < perguntas.size(); i++){ // preenchendo o arrayList com numeros que sao a quantidade de perguntas
        numeros.add(i);
       }
   
      Collections.shuffle(numeros); // embaralha os numeros dentro do arrayList onde vai mudar a posicao em que estava
   
      System.out.println(numeros);

      boolean erro = false;
      String opcao = null;
      int i = 0;
      int quantidadeErros = 0;
      
      
      
      System.out.println("\033[0;3m");
     
       System.out.printf("\t\t\t-------Jogo de Perguntas-------\n");
         System.out.printf("\t\t\t-------Regras do Jogo-------\n");
         System.out.printf("Resposta Correta - ganha 20 Pontos\n");
         System.out.printf("Resposta Errada - perde 10 Pontos\n");
         System.out.printf("2 chances de Erro\n\n");

         System.out.printf("Informe o Nome do Jogador:");
          jogador.setNome(scan.nextLine());

         System.out.printf("\nBem Vindo %s ao Jogo\n\n",jogador.getNome()); 

        
      while (erro == false && i < perguntas.size()){
          System.out.printf("Pergunta %d\n", i + 1);
       System.out.println(perguntas.get(numeros.get(i)));
        System.out.printf("Opcao:");
          opcao = scan.nextLine(); 

        if (opcao.equalsIgnoreCase(alternativasCorretas.get(numeros.get(i)))){
            System.out.println(green + "\nResposta Correta\nMais 20 pontos\n\n" + reset);
             jogador.setPontuacao(jogador.getPontuacao() + 20);
             i++;
        }else {
            jogador.setPontuacao(jogador.getPontuacao() - 10);
            System.out.println(red + "\nResposta Errada\nMenos 10 pontos\n\n" + reset);
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
