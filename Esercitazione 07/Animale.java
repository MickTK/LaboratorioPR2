public class Animale implements Comparable<Animale>{
    String nome;

    public Animale(String nome){
        this.nome = nome;
    }

    public boolean equals(Animale animale){
        if(nome.equals(animale.nome)) return true;
        return false;
    }

    public int compareTo(Animale animale){
        return -nome.compareTo(animale.nome);
    }

    @Override
    public String toString(){
        return nome;
    }
}