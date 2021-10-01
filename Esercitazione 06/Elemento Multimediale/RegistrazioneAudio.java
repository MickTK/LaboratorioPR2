public class RegistrazioneAudio extends ElementoMultimediale{
    public int durata;
    public FormatoAudio formato;
    public int volume;

    public RegistrazioneAudio(String titolo, int durata, FormatoAudio formato, int volume){
        super(titolo);
        this.durata = durata;
        this.formato = formato;
        this.volume = volume;
        if(this.volume > 10) this.volume = 10;
    }

    public void weaker(){
        if(volume > 0) volume--;
    }
    public void louder(){
        if(volume < 10) volume++;
    }

    public void play(){
        for(int j = 0; j < durata; j++){
            
            System.out.print(titolo + "." + formato.toString() + " ");

            for(int i = 0; i < volume; i++)
                System.out.print("!");

            System.out.println();
        }
    }

    @Override
    public void esegui(){
        this.play();
    }
}