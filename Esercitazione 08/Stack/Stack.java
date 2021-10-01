import java.util.*;

public class Stack<T>{
	private List<T> list = new ArrayList<>();
	final int dim;
	
	public Stack(int dimensioneMassima){
		dim = dimensioneMassima;
	}
	
	/**
	 * Aggiunge un elemento in coda alla lista
	 * @param elemento elemento da aggiungere
	 */
	public void push(T elemento){
		if(this.size() < dim)
			list.add(elemento);
	}
	
	/**
	 * Elimina l'ultimo elemento della lista
	 */
	public void pop(){
		if(this.size() > 0)
			list.remove(list.size()-1);
	}
	
	/**
	 * Restituisce l'elemento dell'indice specificato
	 * @param indice indice dell'elemento da restituire
	 * @return elemento corrispondente all'indice specificato
	 */
	public T get(int indice){
		return list.get(indice);
	}
	
	public int size(){
		return list.size();
	}
	
	public void clear(){
		list.clear();
	}
}
