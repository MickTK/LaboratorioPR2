package it.unica.pr2.risorseWeb;

import java.io.*;

public abstract class RisorsaWeb extends java.io.File{
	final String name;
	protected String contenuto;
	
	public RisorsaWeb(String name, String contenuto){
		super(name);
		this.name = name;
		this.contenuto = contenuto;
	}
	
	public String getNome(){
		return name;
	}
	
	public String getContenuto(){
		return contenuto;
	}
	
	public boolean equals(RisorsaWeb r){
		if(this.name == r.name && this.contenuto == r.contenuto)
			return true;
		return false;
	}
	
	public void salva(){
		try(FileWriter myWriter = new FileWriter(name)){
			myWriter.write(contenuto);
		}catch (IOException e){}
	}
}
