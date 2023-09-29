package lista_1;

public class Time {
	private String nome;
	private int Pontos;
	private int saldogols;
	private int Vitoria;
	private int Empate;
	private int Derrota;
	
	Time()
	{
		Vitoria = 0;
		Empate  = 0;
		Derrota = 0;
		Pontos  = 0;
		gols    = 0;
	}
	
	public int getQtdPontos() 
	{
		return Pontos;
	}
	public void setQtdPontos(int qtdpontos) 
	{
		this.Pontos = qtdpontos;
	}
	public int getQtdgols() 
	{
		return gols;
	}
	public void setQtdgols(int qtdgols) 
	{
		this.gols = qtdgols;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public int getQtdVitorias() 
	{
		return Vitoria;
	}
	public void setQtdVitorias(int qtdVitorias) 
	{
		this.Vitoria = qtdVitorias;
	}
	public int getQtdEmpates() 
	{
		return Empate;
	}
	public void setQtdEmpates(int qtdEmpates) 
	{
		this.Empate = qtdEmpates;
	}
	public int getQtdDerrotas() 
	{
		return Derrota;
	}
	public void setQtdDerrotas(int qtdDerrotas) 
	{
		this.Derrota = qtdDerrotas;
	}
	
	public void listar()
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Time : "+ nome);
		System.out.println("Vitorias: "+ Vitoria);
		System.out.println("Empates: "+ Empate);
		System.out.println("Derrotas: " + Derrota);
		System.out.println("Pontos: " + Pontos);
		System.out.println("Gols: " + gols);
	}	
	}

