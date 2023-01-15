package Domaci_12_01_2023;

public class Racun {

    private String brojRacuna;
    private String imePrezime;
    private double trenutnoStanje;


    public String getBrojRacuna() {
        return brojRacuna;
    }

    public Racun(String brojRacuna, String imePrezime, double trenutnoStanje) {
        this.brojRacuna = brojRacuna;
        this.imePrezime = imePrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public double promenaStanja1(double iznos){
        if (this.trenutnoStanje-iznos < 0){
            return 0;
        } return this.trenutnoStanje-iznos;

    }
    public boolean promenaMoguca (double iznos){
        if (this.trenutnoStanje - iznos <=45) {
            return false;
        } return true;
    }


    public void stampaj (){
        System.out.println(this.imePrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je: " + this.getTrenutnoStanje());
    }
}
