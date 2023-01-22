package Domaci_19_01_2023;

public abstract class Ambalaza {
    protected String barcode;
    protected String nazivArtikla;
    protected double netoTezina;
    protected double brutoTezina;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public Ambalaza() {
    }

    public Ambalaza(String barcode, String nazivArtikla, double netoTezina, double brutoTezina) {
        this.barcode = barcode;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }
    public double tezinaAmbalaze (){
        return this.brutoTezina - this.netoTezina;
    }
    public abstract double cena ();
    public abstract void stampaj();
}
