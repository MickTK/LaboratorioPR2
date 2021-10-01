package finanza;

public class Valuta{
    String nomeMoneta;
    double tassoDiCambio;
    String sigla;
    int numeroDiPaesiCheLaUtilizzano;

    public Valuta(String nomeMoneta, double valore){
        this.nomeMoneta = nomeMoneta;
        this.tassoDiCambio = valore;
    }
    public Valuta(String nomeMoneta, String sigla, double valore, int numeroDiPaesiCheLaUtilizzano){
        this.nomeMoneta = nomeMoneta;
        this.tassoDiCambio = valore;
        this.sigla = sigla;
        this.numeroDiPaesiCheLaUtilizzano = numeroDiPaesiCheLaUtilizzano;
    }

    @Override
    public String toString(){
        return "(" + nomeMoneta + "," + " " + tassoDiCambio + ")";
    }

    public boolean equals(Valuta valuta){
        if(nomeMoneta.equals(valuta.nomeMoneta) &&
           tassoDiCambio == valuta.tassoDiCambio &&
           sigla.equals(valuta.sigla) &&
           tassoDiCambio == valuta.tassoDiCambio &&
           numeroDiPaesiCheLaUtilizzano == valuta.numeroDiPaesiCheLaUtilizzano)
           return true;

        return false;
    }
}