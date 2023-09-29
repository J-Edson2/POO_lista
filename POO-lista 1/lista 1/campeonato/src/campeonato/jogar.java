package campeonato;

import campeonato.Campeonato;

import campeonato.Clube;
import campeonato.comparatorPontos;
import java.util.ArrayList;
import java.util.Collections;

public class jogar {
	
	public static void main(String[] args) 
	{
		ArrayList<Clube>Clubes = new ArrayList<Clube>();
		Clube clube1 = new Clube("vasco",0,0);
		Clube clube2 = new Clube("Flamengo",0,0);
		Clube clube3 = new Clube("botafogo",0,0);
		Clube clube4 = new Clube("palmeiras",0,0);
		Clube clube5 = new Clube("fluminense",0,0);
		
		Clubes.add(clube1);
		Clubes.add(clube2);
		Clubes.add(clube3);
		Clubes.add(clube4);
		Clubes.add(clube5);
		
	   Campeonato camp= new Campeonato();
	   camp.jogarCampeonato(Clubes);

	}
}
