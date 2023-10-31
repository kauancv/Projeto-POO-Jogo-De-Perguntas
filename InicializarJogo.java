import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class InicializarJogo {
     

    public void inicializarJogo(Jogador jogador){
        Scanner scan = new Scanner(System.in);
        ArrayList <String> perguntas = new ArrayList<>(); 
        ArrayList <Integer> numeros = new ArrayList<>();
        ArrayList <String> alternativasCorretas = new ArrayList<>();


        for (int i = 0; i < 2; i++){ // preenchendo o arrayList com 10 numeros
        numeros.add(i);
       }
       System.out.println("Antes do Embaralhamento");
       System.out.println(numeros);
       Collections.shuffle(numeros); // embaralha os numeros dentro do arrayList onde vai mudar a posicao em que estava
       System.out.println("Apos o embaralhamento");
       System.out.println(numeros);


       perguntas.add("O que é encapsulamento em Java?\na) Um método que não pode ser acessado fora da classe.\n" + 
                 "b) O processo de ocultar detalhes internos de uma classe e fornecer uma interface pública.\n"+ 
                 "c) Um tipo de loop em Java.\n" + 
                 "b) d) Uma classe abstrata em Java.\n");
       alternativasCorretas.add("A");

       perguntas.add("Qual é a diferença entre uma classe e um objeto?\na)  Uma classe é um tipo de referência, enquanto um objeto é um tipo primitivo.\n" + 
                 "b) Uma classe é um conjunto de atributos e métodos, enquanto um objeto é um conjunto de valores.\n"+ 
                 "c) Uma classe é um tipo de dados, enquanto um objeto é um valor.\n" + 
                 "d)Uma classe é uma abstração de um conceito do mundo real, enquanto um objeto é uma instância de uma classe.\n");

       alternativasCorretas.add("D");
       
       /* for (int i = 0; i < perguntas.size();i++){
         System.out.println(perguntas.get(numeros.get(i)));
       } */
      
        boolean erro = false;
        String opcao = null;
        int i = 0;
        

        while (erro == false){
            if (i < perguntas.size()){
            
          System.out.println(perguntas.get(numeros.get(i)));
          System.out.printf("Informe sua Opcao:");
           opcao = scan.nextLine();

           if (opcao.equalsIgnoreCase(alternativasCorretas.get(i))){ // se acertar 
            System.out.println("Acertou");
             jogador.setPontuacao(jogador.getPontuacao() + 10);
           
            i++;
           }else {   // se errar
            erro = true;
           }
           }else{
            erro = true;
           }
          
          }
         
          System.out.printf("O jogador %s fez %d pontos",jogador.getNome(),jogador.getPontuacao());
           
 

            
       scan.close();
      
      
      
      
      
      
      
      
      
      
      
       /* String opcao = "A";

       if (opcao.equalsIgnoreCase(alternativasCorretas.get(0))){
        System.out.println("Voce Acertou");
       }
 */

    }
     
}