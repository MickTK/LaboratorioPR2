package finanza;

import java.util.Arrays;
import finanza.eccezioni.ConvertitoreOverflowException;
import finanza.eccezioni.ValutaNonTrovataException;

public class ConvertiEuro{
    int numeroMassimoDiValute;
    Valuta[] valute = new Valuta[numeroMassimoDiValute];

    public ConvertiEuro(int numeroMassimoDiValute){
        this.numeroMassimoDiValute = numeroMassimoDiValute;
        for(int i = 0; i < numeroMassimoDiValute; i++){
            valute[i] = null;
        }
    }

    public void impostaValuta(Valuta valuta){
        
        if(valute[numeroMassimoDiValute-1] == null)
            for(int i = 0; i < numeroMassimoDiValute; i++){
                if(valute[i] == null){
                    valute[i] = valuta;
                }
            }
        
        else
            throw new ConvertitoreOverflowException();
    }

    public double converti(double euro, Valuta valuta) throws ValutaNonTrovataException{
        for(int i = 0; i < numeroMassimoDiValute; i++){
            if(valute[i].nomeMoneta == valuta.nomeMoneta){
                return valute[i].tassoDiCambio*euro;
            }
        }

        throw new ValutaNonTrovataException();
    }

    @Override
    public String toString(){
        return Arrays.toString(valute);
    }

    public boolean equals(ConvertiEuro conv){
        for(int i = 0; i < numeroMassimoDiValute; i++){
            if(!valute[i].equals(conv.valute[i])) 
                return false;
        }
        return true;
    }
}