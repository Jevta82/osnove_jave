package Domaci_10_01_2023;

public class Kupac {
    private String ime;
    private String prezime;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Kupac(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public ClanskaKarta clanskaKarta;

    public void setClanskaKarta(ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }
    public void stampaj (){
        System.out.println(this.ime + " " + this.prezime + " Broj kartice: " + this.clanskaKarta.getBrojKartice());

    }
}
