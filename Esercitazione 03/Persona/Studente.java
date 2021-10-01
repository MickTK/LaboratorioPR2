/**
 * Questa classe rappresenta uno studente
 */
public class Studente extends Persona{
	protected int matricola;
	protected Libretto libretto;
	
	Studente(String nome, String cognome, int eta, int matricola){
		super(nome, cognome, eta);
		libretto = new Libretto(2);
		this.matricola = matricola;
	}
	
	/**
	 * Restituisce i dati dello studente
	 * @return dati studente
	 */
	public String anagrafica(){
		return "\\[Nome: " + super.nome + " Cognome: " + super.cognome + " Età: " + super.eta + " Matricola: " + this.matricola + "\\]";
	}
	
	/**
	 * Aggiunge un esame
	 * @param esame esame sostenuto
	 * @param voto voto dell'esame
	 * @return true se l'aggiunta è andata a buon fine, false altrimenti
	 */
	public boolean sostieniEsame(Esame esame, int voto){
		return libretto.addEsame(esame, voto);
	}
	
	/**
	 * Aggiunge un esame
	 * @param esame esame sostenuto
	 * @param voto voto dell'esame
	 * @return true se l'aggiunta è andata a buon fine, false altrimenti
	 */
	public String visualizzaLibretto(){
		return libretto.visualizza();
	}
}
