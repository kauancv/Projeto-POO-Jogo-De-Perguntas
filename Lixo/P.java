package Lixo;
public class P {
    private String pergunta;
    private String alternativas;
    private String respostaCorreta;
    
    
    public P(String pergunta, String alternativas, String respostaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }


    public String getPergunta() {
        return pergunta;
    }
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
    public String getAlternativas() {
        return alternativas;
    }
    public void setAlternativas(String alternativas) {
        this.alternativas = alternativas;
    }
    public String getRespostaCorreta() {
        return respostaCorreta;
    }
    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public void inicializarAray(){

    }

    
}
