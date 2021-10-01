package it.unica.pr2.attrezzaturaNautica;

import java.util.*;

public class Timone implements AttrezzaturaNautica {
	private int direzioneAttuale;
	final int totaleTimoni = 2, direzioniCambiate = 2;	
	
	public Timone(int direzioneAttuale){
		this.direzioneAttuale = direzioneAttuale;
	}
	
	public int getDirezioneAttuale(){
		return direzioneAttuale;
	}
	
	public void imposta(int direzione) {
		if(direzione < 0 || direzione > 360) throw new DirezioneNonValidaException(direzione);
		else direzioneAttuale = direzione;
	}
	
	public boolean equals(Timone timone){
		if(direzioneAttuale == timone.getDirezioneAttuale()) return true;
		return false;
	}
	
	@Override
	public String toString(){	// caso speciale: 0=NORD; 90=EST; 180=SUD; 270=OVEST
		Integer i = direzioneAttuale;
		String s = i.toString();
		
		switch(direzioneAttuale){
			case 0:
				s += " NORD";
				break;
			case 90:
				s += " EST";
				break;
			case 180:
				s += " SUD";
				break;
			case 270:
				s += " OVEST";
				break;
			default: break;
		}
		
		return s;
	}
}
