package Domaci_12_01_2023;

public class Transakcija {

    private String ID;
    private Racun salje;
    private Racun prima;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Racun getSalje() {
        return salje;
    }

    public void setSalje(Racun salje) {
        this.salje = salje;
    }

    public Racun getPrima() {
        return prima;
    }

    public void setPrima(Racun prima) {
        this.prima = prima;
    }

    public Transakcija(String ID, Racun salje, Racun prima) {
        this.ID = ID;
        this.salje = salje;
        this.prima = prima;
    }
    private double provizija (double iznos){
        if (iznos<4500) {
            return 45;
        } else {
            return iznos/100;
        }

    }
    public void izvrsiTransakciju (double iznos){
        double stanjeSalje= this.salje.promenaStanja1(iznos) - provizija(iznos);
         double stanjePrima = this.prima.promenaStanja1(-iznos);
         stampaj();
        System.out.println("Novo stanje na racunu " + this.salje.getImePrezime() +  " je: " + stanjeSalje);
        System.out.println("Novo stanje na racunu " + this.prima.getImePrezime() + " je: " +stanjePrima);

    }
public void stampaj (){
    System.out.println("Racun sa: " + this.salje.getImePrezime() + " - " + this.salje.getBrojRacuna());
    System.out.println("Racun na: " + this.prima.getImePrezime() + " - " + this.prima.getBrojRacuna());


}
}
