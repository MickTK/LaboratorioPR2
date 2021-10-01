public class Filmato extends ElementoMultimediale{
    public int durata;
    public FormatoFilmato formato;
    public int volume;
    public int luminosita;

    public Filmato(String titolo, int durata, FormatoFilmato formato, int volume, int luminosita){
        super(titolo);
        this.durata = durata;
        this.formato = formato;

        this.volume = volume;
        if(this.volume > 10) this.volume = 10;
        
        this.luminosita = luminosita;
        if(this.luminosita > 10) this.luminosita = 10;
    }

    public void weaker(){
        if(volume > 0) volume--;
    }
    public void louder(){
        if(volume < 10) volume++;
    }

    public void brighter(){
        if(luminosita < 10) luminosita++;
    }
    public void darker(){
        if(luminosita > 0) luminosita--;
    }

    public void play(){
        for(int j = 0; j < durata; j++){
            
            System.out.print(titolo + "." + formato.toString() + " ");

            for(int i = 0; i < volume; i++)
                System.out.print("!");

            System.out.print(" ");

            for(int i = 0; i < luminosita; i++)
                System.out.print("*");

            System.out.println();
        }
    }
    
    @Override
    public void esegui(){
        this.play();
    }
}