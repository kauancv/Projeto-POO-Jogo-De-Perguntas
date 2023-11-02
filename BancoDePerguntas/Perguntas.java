package BancoDePerguntas;

import java.util.ArrayList;

public class Perguntas {
   static ArrayList<String> perguntas = new ArrayList<>();

   ArrayList<String> aternativaCorretaArrayList = new ArrayList<>();

   public void bancoDePerguntas() {
      perguntas.add("B - O que é encapsulamento em Java?\na) Um método que não pode ser acessado fora da classe.\n" +
            "b) O processo de ocultar detalhes internos de uma classe e fornecer uma interface pública.\n" +
            "c) Um tipo de loop em Java.\n" +
            "b) d) Uma classe abstrata em Java.\n");

      aternativaCorretaArrayList.add("B");

      perguntas.add(
            "D - Qual é a diferença entre uma classe e um objeto?\na)  Uma classe é um tipo de referência, enquanto um objeto é um tipo primitivo.\n"
                  +
                  "b) Uma classe é um conjunto de atributos e métodos, enquanto um objeto é um conjunto de valores.\n" +
                  "c) Uma classe é um tipo de dados, enquanto um objeto é um valor.\n" +
                  "d)Uma classe é uma abstração de um conceito do mundo real, enquanto um objeto é uma instância de uma classe.\n");

      aternativaCorretaArrayList.add("D");

      perguntas.add("B -Qual é o objetivo de um construtor?\na)Inicializar os atributos de um objeto.\n" +
            "b)Criar um novo objeto.\n" +
            "c)Destruir um objeto.\n" +
            "d)Modificar os atributos de um objeto.\n");

      aternativaCorretaArrayList.add("B");

      perguntas.add(
            " A - O que é uma herança?\na)É o processo de uma classe herdar os atributos e métodos de outra classe.\n" +
                  "b)É o processo de uma classe estender outra classe.\n" +
                  "c)É o processo de uma classe implementar outra classe.\n" +
                  "d)É o processo de uma classe substituir outra classe.\n");

      aternativaCorretaArrayList.add("A");

      perguntas.add(
            "C - O que é um casting? \na)É o processo de converter um tipo de dados primitivo em um tipo de dados não primitivo.\n"
                  +
                  "b)É o processo de converter um tipo de dados primitivo em um tipo de dados não primitivo.\n" +
                  "c)É o processo de converter um tipo de dados não primitivo em um tipo de dados primitivo.\n" +
                  "d)É o processo de converter um objeto em outro objeto.\n");

      aternativaCorretaArrayList.add("C");

      perguntas.add("A - O que é uma classe?\na)Um conjunto de atributos\n" +
            "b)Um tipo de dados\n" +
            "c)Um conjunto de métodos\n" +
            "d)Um objeto\n");

      aternativaCorretaArrayList.add("A");

      perguntas.add(
            "D - O que é um método estático?\na)Um método que pode ser chamado sem a necessidade de uma instância de classe\n"
                  +
                  "b)Um método que pode ser chamado apenas a partir de uma instância de classe\n" +
                  "c)Um método que pode acessar apenas atributos estáticos\n" +
                  "d)Um método que pode ser acessado por qualquer classe\n");

      aternativaCorretaArrayList.add("D");

      perguntas.add(" A -O que é um método virtual?\na)Um método que pode ser substituído por uma subclasse\n" +
            "b)Um método que é chamado dinamicamente\n" +
            "c)Um método que pode ser chamado a partir de uma classe abstrata\n" +
            "d)Um método que pode ser chamado a partir de um objeto\n");

      aternativaCorretaArrayList.add("A");

      perguntas.add("B - Qual é o tipo de relacionamento entre uma classe e sua subclasse?\na)Associação\n" +
            "b)Herança\n" +
            "c)Agregação\n" +
            "d)Composição\n");

      aternativaCorretaArrayList.add("B");

      perguntas.add(
            "D - Qual é a diferença entre herança e composição\na)Herança é uma relação unidirecional, enquanto composição é uma relação bidirecional.\n"
                  +
                  "b)Herança é uma relação entre classes, enquanto composição é uma relação entre objetos.\n" 
                  +
                  "c)Herança permite que uma classe herde atributos e métodos de outra classe, enquanto composição permite que uma classe use objetos de outra classe como seus atributos.\n"
                  +
                  "d)Todas as respostas estão corretas.\n");

      aternativaCorretaArrayList.add("D");
   }

   public void imprimirPergunta(ArrayList <Integer> indice) {
      System.out.println(indice);
      for (int i = 0; i < perguntas.size(); i++) {
         System.out.println(perguntas.get(indice.get(i)));
      }
   }
   public static int tamanhoArrayList(){
      return perguntas.size();
   }
}
