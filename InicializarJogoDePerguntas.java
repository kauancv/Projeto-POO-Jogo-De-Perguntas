import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class InicializarJogoDePerguntas {
    
    public void inicializarJogo(Jogador jogador){
        
        Scanner scan = new Scanner(System.in);

        ArrayList <String> perguntas = new ArrayList<>(); 
        ArrayList <Integer> numeros = new ArrayList<>();
        ArrayList <String> alternativasCorretas = new ArrayList<>();
        
        for (int i = 0; i < 3; i++){ // preenchendo o arrayList com 10 numeros
            numeros.add(i);
        }
       
       Collections.shuffle(numeros); // embaralha os numeros dentro do arrayList onde vai mudar a posicao em que estava
       
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
       
       perguntas.add("A -Qual é o objetivo de um construtor?\na)Inicializar os atributos de um objeto.\n" + 
                 "b)Criar um novo objeto.\n"+ 
                 "c)Destruir um objeto.\n" + 
                 "d)Modificar os atributos de um objeto.\n");

       alternativasCorretas.add("A");
       
       
       boolean erro = false; // usado para verificar no while 
       String opcao = null; // vai ser usada para receber a opcao do usuario
       int i = 0; // contador para verificar a quantidade de perguntas e usar no loop para encerra-lo
       int erros = 0; //contagem de erros
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
        erros++;
        i++;
       }if (erros == 2){
        erro = true;
       }
       }else{
        erro = true;

       }
      
      }
     
      System.out.printf("O jogador %s fez %d pontos",jogador.getNome(),jogador.getPontuacao());
       


        
   scan.close();
  
  
  
  

 }
}
