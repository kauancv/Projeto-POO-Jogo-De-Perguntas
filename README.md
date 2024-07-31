Jogo de Perguntas
Este projeto foi desenvolvido como trabalho final para a disciplina de Programação Orientada a Objetos (POO). O objetivo principal é demonstrar o entendimento e aplicação dos conceitos de POO através de um jogo de perguntas e respostas.

Estrutura do Projeto

O projeto é composto pelos seguintes pacotes e classes:

1. Pacote Versao1

Classe BancoDePerguntas

Mantém um banco de perguntas e suas respectivas alternativas corretas.

Métodos:

bancoDePerguntas(): Preenche o banco de perguntas e alternativas corretas.

getPergunta(int posicao): Retorna a pergunta na posição especificada.

getAlternativa(int posicao): Retorna a alternativa correta na posição especificada.

quantidadePerguntas(): Retorna a quantidade de perguntas.

Classe Indice

Gera e embaralha índices para acessar as perguntas de forma aleatória.

Métodos:

preecherIndices(int quantidadePerguntas): Preenche e embaralha os índices.

getIndice(int posicao): Retorna o índice na posição especificada.

Classe Jogo

Controla o fluxo do jogo de perguntas e respostas.

Métodos:

jogo(Jogador jogador): Inicia o jogo e gerencia as respostas do jogador.

mostrarPontuacao(Jogador jogador): Exibe a pontuação final do jogador.

Classe MainJogo

Ponto de entrada do programa. Cria instâncias de Jogador e Jogo e inicia o jogo.

Classe Jogador

Representa um jogador do jogo.

Atributos:

nome: Nome do jogador.

pontuacao: Pontuação do jogador.

Métodos:

getNome(): Retorna o nome do jogador.

setNome(String nome): Define o nome do jogador.

getPontuacao(): Retorna a pontuação do jogador.

setPontuacao(int pontuacao): Define a pontuação do jogador.

Como Executar

Certifique-se de ter o Java instalado em seu sistema.

Compile todas as classes do pacote Versao1.

Execute a classe MainJogo para iniciar o jogo.

bash
Copiar código
javac Versao1/*.java
java Versao1.MainJogo
Regras do Jogo
O jogador começa com 0 pontos.
Para cada resposta correta, o jogador ganha 20 pontos.
Para cada resposta errada, o jogador perde 10 pontos.
O jogador tem direito a 2 erros. Ao atingir 2 erros, o jogo termina.
