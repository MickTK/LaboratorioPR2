package it.unica.pr2.risorseWeb;

import java.io.*;
import java.util.*;

public class FileWeb extends RisorsaWeb {
	public FileWeb(String name){
		super(name, null);
	
		String data = "";
		File myObj = new File(name);
	
		try(Scanner myReader = new Scanner(myObj)){
			while (myReader.hasNextLine()) {
			data += myReader.nextLine();
			data += "\n";
			}
			data = data.substring(0, data.length() - 1);
        }catch(IOException e){}
      		
      		super.contenuto = data;
	}
	
	public FileWeb(String name, String contenuto){
		super(name, contenuto);
	}
}
