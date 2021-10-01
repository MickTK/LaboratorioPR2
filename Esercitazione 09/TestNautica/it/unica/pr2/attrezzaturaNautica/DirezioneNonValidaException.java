package it.unica.pr2.attrezzaturaNautica;

public class DirezioneNonValidaException extends Error{
	String message;
	
	public DirezioneNonValidaException(int e){
		message = "Direzione " + e + " non valida. La direzione deve essere un valore nell'intervallo [0,360]";
	}
	
	public String stampaCausa(){
		return message;
	}
}
