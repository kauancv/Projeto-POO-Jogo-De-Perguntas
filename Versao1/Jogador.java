package Versao1;

public class Jogador {
    private int pontuacao;
    private String nome;
    
    public Jogador() {
    }
    
    public Jogador(String nome) {
        this.pontuacao = 0;
        this.nome = nome;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
