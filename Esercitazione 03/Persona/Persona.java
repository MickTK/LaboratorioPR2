/**
 * Questa classe rappresenta una persona
 */
public class Persona{
	protected String nome;
	protected String cognome;
	protected int eta;
	
	/**
	 * Costruttore della classe
	 * @param nome nome della persona
	 * @param cognome cognome della persona
	 * @param eta eta della persona
	 */
	Persona(String nome, String cognome, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public int getEta(){
		return this.eta;
	}
	
	/**
	 * Restituisce i dati della persona
	 * @return dati persona
	 */
	public String anagrafica(){
		return "\\[Nome: " + this.nome + " Cognome: " + this.cognome + " Eta': " + this.eta + "\\]";
	}
}
