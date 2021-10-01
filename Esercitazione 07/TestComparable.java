import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class TestComparable{
	public static void main(String[] args){
        
        /* Anche se non è possibile istanziare le interfacce (e le classi astratte)
         * è comunque possibile creare array di questi tipi a condizione che tutti
         * gli elementi dell'array siano istanziati con classi che implementano
         * l'interfaccia (o estendono la classe astratta).
         */
		Comparable[] c = new Comparable[5];

		// Nome, Cognome, anno di nascita
		c[0] = new Persona("Mario", "Rossi", 1980);

		// Nome, lunghezza della coda in cm
		c[1] = new Gatto("Fuffi", 10.0);

		// Nome, Cognome, anno di nascita, università
		c[2] = new Studente("Bruno", "Bianchi", 1991, "Cagliari");

		// Nome
		c[3] = new Animale("Boris");



		// In questo esercizio due Persone sono uguali se hanno stesso anno di nascita
		Persona  mario = (Persona)c[0];
		Studente bruno = (Studente)c[2];

		Studente gianni = new Studente("Gianni", "Verdi", 1980, "Sassari");
		assert mario.equals(gianni);
		assert gianni.equals(mario);

		Persona bruno2 = new Persona("Bruno", "Bianchi", 1991);
		assert !mario.equals(bruno2);
		assert bruno2.equals(bruno);


		// In questo esercizio due Animali sono uguali se hanno stesso nome
		Animale boris = (Animale)c[3];
		Gatto fuffi = (Gatto)c[1];

		assert !boris.equals(fuffi);

		Gatto boris2 = new Gatto("Boris", 12.5);
		assert boris2.equals(boris);



		// In questo esercizio una Persona è più grande di un'altra se è nata prima
		Persona[] persone = new Persona[3];
		persone[0] = new Persona("Bruno", "Bianchi", 1991);
		persone[1] = new Persona("Mario", "Rossi", 1980);
		persone[2] = new Persona("Carlo", "Verdi", 1985);

		// Array prima dell'ordinamento
		assert Arrays.toString(persone).equals("[Bruno, Mario, Carlo]");

		/* Ordinamento dell'array.
         * L'array viene ordinato automaticamente da Java se il tipo dell'array
         * (cioè Persona) è comparabile. Non è quindi necessario implementare 
         * un algoritmo di ordinamento in Java ma solo il metodo di confronto.
         */
		Arrays.sort(persone);

		// Array dopo l'ordinamento (decrescente)
		assert Arrays.toString(persone).equals("[Bruno, Carlo, Mario]");



		// In questo esercizio un Animale è più grande di un altro se, in ordine alfabetico,
		// il suo nome è più grande dell'altro nome.
		Animale[] animali = new Animale[3];
		animali[0] = new Animale("Fuffi");
		animali[1] = new Animale("Bau");
		animali[2] = new Animale("Boris");

		// Array prima dell'ordinamento
		assert Arrays.toString(animali).equals("[Fuffi, Bau, Boris]");

		/* Ordinamento dell'array.
         * L'array viene ordinato automaticamente da Java se il tipo dell'array
         * (cioè Persona) è comparabile. Non è quindi necessario implementare 
         * un algoritmo di ordinamento in Java ma solo il metodo di confronto.
         */
        Arrays.sort(animali);

		// Array dopo l'ordinamento (decrescente)
		assert Arrays.toString(animali).equals("[Fuffi, Boris, Bau]");
        
        
        /* PARTE AVANZATA */
        
        
        /* E' possibile radunare gli animali in una cuccia.
         * La Cuccia deve poter gestire oggetti di tipo di Animale,
         * (non posso mettere stringhe o persone nella cuccia).
         * La seguente cuccia può ospitare un MASSIMO di 5 gatti.
         * HINT: non è possibile modellare la cuccia con un array 
         * in quanto non si può dichiarare un array generico; modella
         * la Cuccia utilizzando la classe LinkedList di Java presentata
         * nelle slide: consulta le API e vedi un esempio di utilizzo 
         * delle liste nel codice seguente.
         */
        Cuccia<Gatto> cuccia = new Cuccia<>(5);
        
        // E' possibile aggiungere gli animali uno alla volta
        cuccia.aggiungi(new Gatto("Fuffi", 10.5));
        
        // Esempio di costruzione di una lista in Java
        List<Gatto> esempioListaAnimali = new LinkedList<>();
        esempioListaAnimali.add(new Gatto("Miao", 10D));
        esempioListaAnimali.add(new Gatto("Gavino", 11.7));

        // La cuccia consente di aggiungere anche una lista di animali
        // Ti ricordi cosa è un overload?
        cuccia.aggiungi(esempioListaAnimali);
        
        /* La rappresentazione in stringa della cuccia restituisce
         * il contenuto della cuccia ORDINATO: quindi in questo caso
         * dove abbiamo una Cuccia<Gatto> Java utilizza automaticamente 
         * il compareTo della classe Gatto.
         * Importante: abbiamo visto che puoi ordinare un array con 
         * Arrays.sort(mioArray). Per ordinare la tua lista puoi utilizzare
         * lo stesso il metodo sort ma della classe Collections.
         */
        System.out.println(cuccia);
        assert cuccia.toString().equals("[Miao, Gavino, Fuffi]");
	}
}
