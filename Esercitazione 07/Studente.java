public class Studente extends Persona{
    String universita;

    public Studente(String nome, String cognome, int anno, String universita){
        super(nome, cognome, anno);
        this.universita = universita;
    }
}