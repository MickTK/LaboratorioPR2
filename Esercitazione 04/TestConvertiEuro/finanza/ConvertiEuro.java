package finanza;

import java.util.Arrays;

public class ConvertiEuro{
    int numeroMassimoDiValute = 3;
    Valuta[] valute = new Valuta[numeroMassimoDiValute];

    public ConvertiEuro(){
        for(int i = 0; i < numeroMassimoDiValute; i++){
            valute[i] = null;
        }
    }

    public boolean impostaValuta(Valuta valuta){
        for(int i = 0; i < numeroMassimoDiValute; i++){
            if(valute[i] == null){
                valute[i] = valuta;
                return true;
            }
        }
        return false;
    }

    public double converti(double euro, String moneta){
        for(int i = 0; i < numeroMassimoDiValute; i++){
            if(valute[i].nomeMoneta == moneta){
                return valute[i].valoreMoneta*euro;
            }
        }

        return -1;
    }

    @Override
    public String toString(){
        return Arrays.toString(valute);
    }
}