public class LettoreMultimediale{
    public static void main(String[] args){
        ElementoMultimediale[] elemenentoMultimediale = new ElementoMultimediale[3];

        elemenentoMultimediale[0] = new RegistrazioneAudio("I bambini fanno ah", 2, FormatoAudio.MP3, 10);
        elemenentoMultimediale[1] = new Filmato("OTTO E MEZZO - LITE CAPEZZONE TRAVAGLIO", 11, FormatoFilmato.AVI, 10, 10);
        elemenentoMultimediale[2] = new Immagine("Gattino", FormatoImmagine.JPEG, 5);

        for(ElementoMultimediale e : elemenentoMultimediale){
            e.esegui();
        }
    }
}