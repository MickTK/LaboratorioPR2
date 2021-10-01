package it.pr2.BlackJack;

import java.util.*;

public class Giocatore{
	private String nome;
	private Integer somma;
	private List<Carta> carte;
	
	public Giocatore(String nome){
		this.nome = nome;
		somma = 0;
		carte = new ArrayList<>();
	}
	
	public String getNome(){
		return nome;
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
