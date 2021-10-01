package it.pr2.BlackJack;

import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;

public class Classifica{
	public Classifica(){}
	
	public static void aggiorna(Giocatore giocatore, Banco banco, Risultato risultato){
		FileReader inputStream = null;
		FileWriter outputStream = null;
	        try {
		    inputStream = new FileReader("Classifica.txt");
		    int c;

		    while ((c = inputStream.read()) != -1)
			outputStream.write(c);
			
			System.out.println(inputStream.read());
		}
		catch(Exception e){}
		finally {
		    try{inputStream.close();} catch(Exception e){}
		}
		
		try {
		    outputStream = new FileWriter("Classifica.txt");
		    
		    outputStream.write("giocatore");
		}
		catch(Exception e){}
		finally {
		    try{outputStream.close();} catch(Exception e){}
		}
	}
}
