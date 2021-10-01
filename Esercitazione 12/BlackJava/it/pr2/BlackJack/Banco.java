package it.pr2.BlackJack;

import java.util.*;

public class Banco{

	private List<Carta> carte;
	private int somma;

	public Banco(){
		carte = new ArrayList<>();
		somma = 0;
	}

	public Integer getSommaCarte(){
		return somma;
	}
	public void aggiungiCarta(Carta carta){
		somma += carta.getValore();
		carte.add(carta);
	}
	
	@Override
	public String toString(){
		String s = "";
		
		for(int i = 0; i < carte.size(); i++){
			s += carte.get(i).getValore().toString();
			if(i < carte.size()-1)
				s += " + ";
		}
		
		return s;
	}
}
