/**
 * Questa classe rappresenta un lavoratore
 */
public class Lavoratore extends Persona{
	protected double stipendio;
	
	Lavoratore(String nome, String cognome, int eta){
		super(nome, cognome, eta);
		this.stipendio = 100;
	}
	Lavoratore(String nome, String cognome, int eta, double stipendio){
		super(nome, cognome, eta);
		if(stipendio < 100)
			this.stipendio = 100;
		else
			this.stipendio = stipendio;
	}
	
	public double getStipendio(){
		return this.stipendio;
	}
	
	/**
	 * Restituisce i dati del lavoratore
	 * @return dati lavoratore
	 */
	public String anagrafica(){
		return "\\[Nome: " + super.nome + " Cognome: " + super.cognome + " Età: " + super.eta + " Stipendio: " + this.stipendio + "\\]";
	}
	
	/**
	 * Incrementa lo stipendio del lavoratore
	 * @param perc percentuale di aumento dello stipendio
	 */
	public void incrementaStipendio(int perc){
		if(perc >= 0 && perc <= 100){
			this.stipendio += (this.stipendio/100*perc);
		}
	}
}
