import java.util.*;

public class GenericsHashMap<T, S> {
	HashSet<Pair<T, S>> hashSet = new HashSet<>();
	
	public GenericsHashMap(){
		
	}
	
	/**
	 * Aggiunge una coppia nell'hashset
	 * @param t primo elemento della coppia
	 * @param s secondo elemento della coppia
	 */
	public void put(T t, S s){
		hashSet.add(new Pair<>(t, s));
	}
	
	
	/**
	 * Restituisce il valore della chiave
	 * @param t chiave
	 * @return valore
	 */
	public S get(T t){
		for(Pair<T, S> p : hashSet)
			if(p.t.equals(t))
				return p.s;
		return null;
	}
	
	public int size(){
		return hashSet.size();
	}
	
	public void remove(T t){
		hashSet.remove(this.get(t));
	}
	
	public Set<T> getKeys(){
		Set<T> list = new HashSet<>();
		
		for(Pair<T, S> p : hashSet)
			list.add(p.t);
			
		return list;
	}
	
	public Set<S> getValues(){
		Set<S> list = new HashSet<>();
		
		for(Pair<T, S> p : hashSet)
			list.add(p.s);
			
		return list;
	}
}
