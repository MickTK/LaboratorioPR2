package it.unica.pr2.risorseWeb;

import java.util.*;

public class Ordina{

	static public List<RisorsaWeb> perCriterioUtente(Set<RisorsaWeb> set, Comparator<RisorsaWeb> c){
		List<RisorsaWeb> lista = new ArrayList<>(set);
		
		Collections.sort(lista, c);
		return lista;
	}
	
	static public List<RisorsaWeb> perLunghezzaContenuto(Set<RisorsaWeb> set){
		List<RisorsaWeb> lista = new ArrayList<>(set);
		
		Collections.sort(lista, 
			(RisorsaWeb a, RisorsaWeb b) -> a.getContenuto().length() - b.getContenuto().length() );
			
		return lista;
	}
}
