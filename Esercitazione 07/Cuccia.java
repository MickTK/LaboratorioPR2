import java.util.*;

public class Cuccia<T extends Animale>{
    List<T> o = new LinkedList<>();
    private int massimo;

    public Cuccia(int massimo){
        this.massimo = massimo;
    }

    public void aggiungi(T t){
        o.add(t);
    }

    public void aggiungi(List<T> t){
        for(int i = 0; i < t.size(); i++)
            o.add(t.get(i));
    }

    @Override
    public String toString(){
        Collections.sort(o);
        return o.toString();
    }
}