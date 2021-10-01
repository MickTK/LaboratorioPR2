package finanza;

public class Valuta{
    String nomeMoneta;
    double valoreMoneta;

    public Valuta(String nomeMoneta, double valore){
        this.nomeMoneta = nomeMoneta;
        this.valoreMoneta = valore;
    }

    @Override
    public String toString(){
        return "(" + nomeMoneta + "," + " " + valoreMoneta + ")";
    }
}