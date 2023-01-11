package Domaci_10_01_2023;

public class Proizvod {
    private String nazivProizvoda;
    private double cenaIzrade;

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Proizvod(String nazivProizvoda, double cenaIzrade) {
        this.nazivProizvoda = nazivProizvoda;
        this.cenaIzrade = cenaIzrade;
    }

    public Kupac musterija;

    public void setMusterija(Kupac musterija) {
        this.musterija = musterija;
    }

    public double cenaProizvoda (){
        double cena = this.cenaIzrade*1.9 * (100 - this.musterija.clanskaKarta.getPopust() ) / 100;
        return cena;
}
public void stampaj (){
    System.out.println(this.nazivProizvoda + " - " + this.cenaProizvoda() + " dinara");
    System.out.println(this.musterija.getIme() + " " + this.musterija.getPrezime() + " - Broj clanske karte: " + this.musterija.clanskaKarta.getBrojKartice());

    }
}
