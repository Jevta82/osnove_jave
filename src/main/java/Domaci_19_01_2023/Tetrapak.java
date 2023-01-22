package Domaci_19_01_2023;

public class Tetrapak extends Ambalaza{

    private boolean reciklirase;
    public double osnovnaCena;

    public boolean isReciklirase() {
        return reciklirase;
    }

    public void setReciklirase(boolean reciklirase) {
        this.reciklirase = reciklirase;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(boolean reciklirase, double osnovnaCena) {
        this.reciklirase = reciklirase;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barcode, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklirase, double osnovnaCena) {
        super(barcode, nazivArtikla, netoTezina, brutoTezina);
        this.reciklirase = reciklirase;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        if (this.isReciklirase()) {
           return  (this.tezinaAmbalaze()*1.5)+this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Osnovna cena artikla je: " + this.osnovnaCena);
        System.out.println("Ime artikla je: " + this.getNazivArtikla());
        System.out.println("Tezina artikla je: " + this.tezinaAmbalaze());

    }
}
