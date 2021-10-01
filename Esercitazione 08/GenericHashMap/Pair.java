public class Pair<T, S>{
	final T t;
	final S s;

	public Pair(T t, S s){
		this.t = t;
		this.s = s;
	}
	
	public T getFirst(){
		return t;
	}
	
	public S getSecond(){
		return s;
	}
	
	public boolean equals(Pair<T, S> p){
		if(this.t.equals(p.t) && this.s.equals(p.s))
			return true;
		return false;
	}
}
