public class Immagine extends ElementoMultimediale{
    public FormatoImmagine formato;
    public int luminosita;

    public Immagine(String titolo, FormatoImmagine formato, int luminosita){
        super(titolo);
        this.formato = formato;
        this.luminosita = luminosita;
        if(this.luminosita > 10) this.luminosita = 10;
    }

    public void brighter(){
        if(luminosita < 10) luminosita++;
    }
    public void darker(){
        if(luminosita > 0) luminosita--;
    }

    public void show(){
        System.out.print(titolo + "." + formato.toString() + " ");

        for(int i = 0; i < luminosita; i++)
            System.out.print("*");

        System.out.println();
    }

    @Override
    public void esegui(){
        this.show();
    }
}