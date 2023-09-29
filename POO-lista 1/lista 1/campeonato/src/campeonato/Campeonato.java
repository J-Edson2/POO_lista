package campeonato;
import java.util.ArrayList;

import campeonato.jogar;
import java.util.Collections;

public class Campeonato {
	public int Random_Placar(int min, int max)
	{
		int numrandom = (int)((Math.random()*((max-min)+1))+min);
		return numrandom;
	}
	
	public void jogarCampeonato(ArrayList<Clube>Clubes) {
		Campeonato camp = new Campeonato();
		for(int i = 0; i < Clubes.size(); i++) {
			Clube clubeA = Clubes.get(i);
			for(int j = 0; j <Clubes.size(); j++) {
				Clube clubeB = Clubes.get(j);
				if(clubeA.getNome().compareTo(clubeB.getNome())> 0) {
					System.out.println("Time vencedor da rodada:");
					camp.jogarPartida(clubeA, clubeB);
					System.out.println("************************* \n");					
				}				
			}
		}
		for(int j = 0; j < Clubes.size(); j++) {
			Clube clubeA = Clubes.get(j);
			for(int i = 0; i <Clubes.size(); i++) {
				Clube clubeB = Clubes.get(i);
				if(clubeA.getNome().compareTo(clubeB.getNome())> 0) {
					System.out.println("Time vencedor da rodada:");
					camp.jogarPartida(clubeB, clubeA);
					System.out.println("************************* \n");					
				}				
			}
		}	
		camp.getClassificação(Clubes);
		camp.getCampeao(Clubes);
	}
	public void jogarPartida(Clube m, Clube v) 
	{
	int gols_m = Random_Placar(0,5);
	int gols_v = Random_Placar(0,5);
	int saldo_m = gols_m - gols_v;
	int saldo_v = gols_v - gols_m;
	if(m.ganhar(saldo_m) == 1) {
		System.out.println(m.getNome());
		m.setQtdGols(m.getQtdGols()+saldo_m);
		v.setQtdGols(v.getQtdGols()+saldo_v);
		m.setQtdPontos(m.getQtdPontos()+3);
	}
	else if(m.perder(saldo_m) == 1) {
		System.out.println(v.getNome());
		m.setQtdGols(m.getQtdGols()+saldo_m);
		v.setQtdGols(v.getQtdGols()+saldo_v);
		v.setQtdPontos(v.getQtdPontos()+3);
	}
	else {
		System.out.println("empate");
		v.setQtdPontos(v.getQtdPontos()+1);
		m.setQtdPontos(m.getQtdPontos()+1);
		
	}

	}	
	
	public void getClassificação(ArrayList<Clube>Clubes){
		   Collections.sort(Clubes,new comparatorPontos());
		   System.out.println("Tabela de Classificaçao:");
		   for (Clube c : Clubes) {
			    System.out.println("///////////////////////");
				System.out.println(c.getNome());
				System.out.println("Pontos:");
				System.out.println(c.getQtdPontos());
				System.out.println("///////////////////////");
				
			}
	}
	
	public void getCampeao(ArrayList<Clube>Clubes) {
		System.out.println("*************************** \n");
		System.out.println("Parabéns ao campeao!");
		System.out.println(Clubes.get(0).getNome());
		System.out.println("*************************** \n");
	}
	
}
