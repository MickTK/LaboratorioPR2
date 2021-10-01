package it.pr2.BlackJack.test;

import it.pr2.BlackJack.*;
import java.util.*;

public class Test{
	public static void main(String[] args){
		String scelta = "", modalita = "";
		String nome = "";
		int numeroCarte = 104;
	
		// Viene chiesto chi deve giocare
		System.out.println("1 - Giocatore vs Computer");
		System.out.println("2 - Giocatore vs Giocatore");
		System.out.println("3 - Computer vs Computer");
		
		Scanner scan = new Scanner(System.in);
		modalita = scan.nextLine();
		
		System.out.println();
		
		// Viene scelto il nome del giocatore
		while(nome.length() <= 0){
			System.out.print("Inserire nome del giocatore: ");
			
			nome = scan.nextLine();
			
			System.out.println();
		}
		
		// Oggetti
		Giocatore giocatore = new Giocatore(nome);
		Banco banco = new Banco();
		List<Carta> carte = new ArrayList<>();
		Random rand = new Random();
		Risultato risultato = new Risultato();
		
		// Vengono inizializzate le carte del mazzo
		int x = 0, j = 0;
		for(int i = 0; i < numeroCarte; i++){
			// Valore della carta
			x = j%13 + 1;
			if(x > 10) x = 10;
			// Aggiunta carta al mazzo
			carte.add(new Carta(x));
			// Ripristino valore per seme
			if(j >= 12) j = 0;
			else j++;
		}
		assert carte.get(103).getValore() == 10;
		assert carte.size() == 104;
		
		// Vengono assegnate le carte dei primi due giri
		x = rand.nextInt(numeroCarte);
		giocatore.aggiungiCarta(carte.get(x));
		carte.remove(x);
		numeroCarte--;
		
		x = rand.nextInt(numeroCarte);
		banco.aggiungiCarta(carte.get(x));
		carte.remove(x);
		numeroCarte--;
		
		x = rand.nextInt(numeroCarte);
		giocatore.aggiungiCarta(carte.get(x));
		carte.remove(x);
		numeroCarte--;
		
		// Turno giocatore
		System.out.println("Turno " + giocatore.getNome());
		while(true){
			tavolo(giocatore, banco);
			
			// Il giocatore sballa
			if(giocatore.getSommaCarte() > 21) break;
			
			
			// Modalita giocatore
			if (modalita.equals("1") || modalita.equals("2")){
				// Scelta da parte del giocatore
				System.out.println("1 - Chiedi carta");
				System.out.println("2 - Stai");
				scelta = scan.nextLine();
				System.out.println();
			}
			
			// Modalita computer
			else if(modalita.equals("3")){
				if (giocatore.getSommaCarte() < 17) scelta = "1";
				else scelta = "2";
			}
			
			// Controlli
			if(scelta.equals("1")){
				x = rand.nextInt(numeroCarte);
				giocatore.aggiungiCarta(carte.get(x));
				carte.remove(x);
				numeroCarte--;
			}
			else if(scelta.equals("2")) break;
		}
		if(giocatore.getSommaCarte() <= 21){
			// Turno banco
			System.out.println("Turno banco");
			while(true){
				tavolo(giocatore, banco);
				
				// Il giocatore sballa
				if(banco.getSommaCarte() > 21) break;
				
				
				// Modalita giocatore
				if (modalita.equals("2")){
					// Scelta da parte del giocatore
					System.out.println("1 - Chiedi carta");
					System.out.println("2 - Stai");
					scelta = scan.nextLine();
					System.out.println();
				}
				
				// Modalita computer
				else if(modalita.equals("3") || modalita.equals("1")){
					if (banco.getSommaCarte() < 17) scelta = "1";
					else scelta = "2";
				}
				
				// Controlli
				if(scelta.equals("1")){
					x = rand.nextInt(numeroCarte);
					banco.aggiungiCarta(carte.get(x));
					carte.remove(x);
					numeroCarte--;
				}
				else if(scelta.equals("2")) break;
			}
		}
		
		tavolo(giocatore, banco);
		
		/* Controlli di vittoria */
		if(giocatore.getSommaCarte() >= 17 && giocatore.getSommaCarte() <= 21)
			if(banco.getSommaCarte() >= 17 && banco.getSommaCarte() <= 21)
				if(giocatore.getSommaCarte() > banco.getSommaCarte()){
					System.out.println("Ha vinto " + giocatore.getNome() + "!");
					risultato = Risultato.Vittoria;
				}
				else if(giocatore.getSommaCarte() < banco.getSommaCarte()){
					System.out.println("Ha vinto il banco!");
					risultato = Risultato.Sconfitta;
				}
				else 	{
					System.out.println("Pareggio");
					risultato = Risultato.Pareggio;
				}
					
		if(giocatore.getSommaCarte() > 21) {
			System.out.println(giocatore.getNome() + " sballa");
			risultato = Risultato.Sconfitta;
		}
		else if(banco.getSommaCarte() > 21){
			System.out.println("Il banco sballa");
			risultato = Risultato.Vittoria;
		} 
			
		Classifica.aggiorna(giocatore, banco, risultato);
	}
	
	/* Visualizza le carte in tavola */
	public static void tavolo(Giocatore giocatore, Banco banco){
		System.out.println("------------------------------");
		System.out.println("Banco: " + banco.toString() + " = " + banco.getSommaCarte());
			System.out.println(giocatore.getNome() + ": " + giocatore.toString() + " = " + giocatore.getSommaCarte());
			System.out.println("------------------------------");
			System.out.println();
	}
}
