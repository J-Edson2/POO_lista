package Trabalho;

public class Time {
    //Armazena nome do time
    private String nomeTime;
    //Armazena cidade natal do time
    private String cidadeTime;
    
    

    public Time(String nome, String cidade){
        setNomeTime(nome);
        setCidadeTime(cidade);
        
    }
    //aplicar conceitos de encapsulamento
    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getCidadeTime() {
        return cidadeTime;
    }

    public void setCidadeTime(String cidadeTime) {
        this.cidadeTime = cidadeTime;
    }
    
}
