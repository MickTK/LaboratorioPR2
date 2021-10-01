package it.unica.pr2.attrezzaturaNautica;

import java.util.*;

public class Barca extends HashSet<AttrezzaturaNautica> implements AttrezzaturaNautica{
	private int size;
	private int direzioneAttuale;
	private Timone timone;
	
	public Barca(){
		super();
		size = 0;
		direzioneAttuale = 0;
	}
	
	public void setTimone(Timone timone){
		this.timone = timone;
		size = 1;
	}
	
	public int size(){
		return size;
	}
	
	public int direzioneAttuale(){
		if(timone == null) return 0;
		return timone.getDirezioneAttuale();
	}
	
	public boolean contains(Timone timone){
		if(this.timone.equals(timone)) return true;
		return false;
	}
}
