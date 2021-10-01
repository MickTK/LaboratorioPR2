package finanza.test;

import finanza.ConvertiEuro;
import finanza.Valuta;

/**
 * Test per la classe ConvertiEuro.
 * @author Livio
 */
public class TestConvertiEuro {

	public static void main(String[] args){
		double valore;

		// Convertitore per massimo 3 valute.
		ConvertiEuro mioConvertitore = new ConvertiEuro();

		// Crea 4 nuove valute.
		//La valuta è definita da un nome e dal tasso di cambio rispetto all'euro.
		Valuta yen = new Valuta("Yen", 126.83);
		Valuta usd = new Valuta("USD", 1.14);
		Valuta brl = new Valuta("Real brasiliano", 4.11);
		Valuta cad = new Valuta("Dollaro canadese", 1.48);



		boolean result;

        // Aggiungi al convertitore una nuova valuta
        // così facendo si registra il tasso di scambio (in questo caso euro/yen).
		result = mioConvertitore.impostaValuta(yen);
		assert result;

		result = mioConvertitore.impostaValuta(usd);
		assert result;

		result = mioConvertitore.impostaValuta(brl);
		assert result;

		result = mioConvertitore.impostaValuta(cad); // Rende false perché non è stato possibile aggiungere una nuova valuta
		assert !result;
        


        // Stampa del convertitore
        String stampa = mioConvertitore.toString();
        System.out.println(mioConvertitore);
        assert stampa.equals("[(Yen, 126.83), (USD, 1.14), (Real brasiliano, 4.11)]");      
        


		// Conversione corretta
		// converte 50 euro in dollari
        valore = mioConvertitore.converti(50.00, "USD");
        assert (valore > 56.9) && (valore < 57);
        System.out.println("\n50.00 euro corrispondono a " + valore + " dollari.");

        // Tentativo di conversione errata
        valore = mioConvertitore.converti(50.00, "Sterlina");
        assert valore == -1;    // Se la valuta non è registrata nel convertitore il metodo rende -1
        

	}
}
