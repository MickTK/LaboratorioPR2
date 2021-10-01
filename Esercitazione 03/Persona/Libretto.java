/**
 * Questa classe rappresenta il libretto degli esami
 */
public class Libretto{
	protected Esame[] esami;
	protected int[] voti;
	protected int esamiRegistrabili;
	protected int esamiRegistrati;
	
	Libretto(int esamiRegistrabili){
		this.esamiRegistrabili = esamiRegistrabili;
		this.esamiRegistrati = 0;
		esami = new Esame[esamiRegistrabili];
		voti = new int[esamiRegistrabili];
	}
	
	/**
	 * Registra un esame nel libretto
	 * @return true se la registrazione è andata a buon fine, false altrimenti
	 */
	public boolean addEsame(Esame esame, int voto){
		if(voto >= 18 && voto <= 31 && esamiRegistrati < esamiRegistrabili){
			esamiRegistrati++;
			esami[esamiRegistrati-1] = esame;
	      		voti[esamiRegistrati-1] = voto;
	      		
	      		return true;
		}
		return false;	
	}
	
	public String visualizza(){
		String x = "\\[";
		
		for(int i = 0; i < esamiRegistrati; i++){
			if(i > 0) x += ", ";
			x += esami[i].nome + " " + voti[i];
		}
		x += "\\]";
		
		return x;
	}
}
