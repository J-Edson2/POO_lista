package campeonato;

public class Clube {
	private String nome;
	private int Pontos;
	private int gols;

	public Clube(String nome, int pontos, int gols){
		this.nome = nome;
		this.Pontos = pontos;
		this.gols = gols;

	}
	
	public int getQtdPontos() 
	{
		return Pontos;
	}
	public void setQtdPontos(int qtdpontos) 
	{
		this.Pontos = qtdpontos;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getQtdGols() 
	{
		return gols;
	}
    public void setQtdGols(int qtdgols) {
		this.gols = qtdgols;
	}
    
    int ganhar(int gols) {
    	if (gols > 0) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
    }
    
    int empatar() {
    	return 0;
    }
    
    int perder(int gols) {
    	if(gols < 0) {
    		return 1;
    	}
    	else{
    		return 0;
    	}
    }
		

}
