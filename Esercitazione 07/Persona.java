public class Persona implements Comparable<Persona>{
    String nome;
    String cognome;
    int anno;

    public Persona(String nome, String cognome, int anno){
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
    }

    public boolean equals(Persona persona){
        if(anno == persona.anno) return true;
        return false;
    }

    public int compareTo(Persona persona){
        if(anno < persona.anno) return 1;
        else if(anno == persona.anno) return 0;
        else return -1;
    }

    @Override
    public String toString(){
        return nome;
    }
}