/*

	ESERCITAZIONE

	compile: 	javac <nome file test>
	run:		java <nome classe test>

	Per lo sviluppo e' possibile commentare le righe non ancora implementate 
    (ad esempio commentare tutte le righe dopo il primo Test).

*/

public class TestPersona {
	public static void main(String[] args) {

		// Test costruttori Persona e Lavoratore
		Persona persona = new Persona("Mario", "Rossi", 20);
        Lavoratore pagato = new Lavoratore("Carlo", "Verdi", 50);
		Lavoratore sottopagato = new Lavoratore("Bruno", "Neri", 21, 20);

		// Test metodo get Persona
		assert persona.getEta() == 20;
    
		// Test metodi get Lavoratore
        assert pagato.getStipendio() == 100;
		assert sottopagato.getStipendio() == 100;
        assert sottopagato.getEta() == 21;
        
		// Test metodo incrementa stipendio
		sottopagato.incrementaStipendio(10); // Incrementa lo stipendio del 10%
		assert sottopagato.getStipendio() == 110;

        // Test metodo incrementa stipendio
        sottopagato.incrementaStipendio(-10); // Non modifica lo stipendio.
		assert sottopagato.getStipendio() == 110;
        
        // Test costruttore Esame
        Esame pr1 = new Esame("PR1", 12);
        Esame pr2 = new Esame("PR2", 9);
        Esame rc = new Esame("RC", 9);
        
        // Test costruttore Studente
        Studente gianni = new Studente("Gianni", "Rossi", 20, 1000);

        // Test metodi anagrafica
        // Implementato in modo diverso
        /*assert persona.anagrafica().equals("[Nome: Mario Cognome: Rossi Eta': 20]");
        assert sottopagato.anagrafica().equals("[Nome: Bruno Cognome: Neri Eta': 21 Stipendio: 110]");
        assert gianni.anagrafica().equals("[Nome: Gianni Cognome: Rossi Eta': 20 Stipendio: 1000]");*/

        // Test costruttore Libretto
        Libretto l = new Libretto(5);

        // Test metodo sostieniEsame
        assert gianni.sostieniEsame(pr1, 30);
        assert !gianni.sostieniEsame(pr1, 17); // Voto insufficiente
        assert gianni.sostieniEsame(pr2, 30);
        assert !gianni.sostieniEsame(pr2, 30); // Registro pieno
        
        // Test visualizzaLibretto
        // Implementato in modo diverso (con la virgola)
        /*assert gianni.visualizzaLibretto().equals("[PR1 30 PR2 30]");*/
        
		System.out.println("Ok!");
	}
}

