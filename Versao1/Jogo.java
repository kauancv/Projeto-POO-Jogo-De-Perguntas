package Versao1;

// import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
 BancoDePerguntas perguntas = new BancoDePerguntas();
 Indice indices = new Indice();
 BancoDePerguntas alternativa = new BancoDePerguntas();
 
 String reset = "\u001B[0m";
 String red = "\u001B[31m";
 String green = "\u001B[32m";

  Scanner scan = new Scanner(System.in);

     public void jogo(Jogador jogador){
       perguntas.bancoDePerguntas();
       indices.preecherIndices(perguntas.quantidadePerguntas());
       
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
       
       while (erro == false && i < perguntas.quantidadePerguntas()){
        System.out.printf("Pergunta %d\n", i + 1);
     System.out.println(perguntas.getPergunta(indices.getIndice(i)));
      System.out.printf("Opcao:");
        opcao = scan.nextLine(); 

      if (opcao.equalsIgnoreCase(perguntas.getAlternativa(indices.getIndice(i)))){
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

        scan.close();
     }
    
}
