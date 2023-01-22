package Domaci_19_01_2023;

public class StaklenaAmbalaza extends Ambalaza{

    private double kaucija;
    private boolean daliSePlacaKaucija;
    private double osnovnaCena;

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaliSePlacaKaucija() {
        return daliSePlacaKaucija;
    }

    public void setDaliSePlacaKaucija(boolean daliSePlacaKaucija) {
        this.daliSePlacaKaucija = daliSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        if (isDaliSePlacaKaucija()){
            return this.osnovnaCena*1.2 + this.kaucija;
        } return this.osnovnaCena*1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("Ime staklene ambalaze: " + this.getNazivArtikla());
        System.out.println("Cena je: " + this.cena());
        if (daliSePlacaKaucija) {
            System.out.println("Potrebno je platiti kauciju");
        } else {
            System.out.println("Ne placa se kaucija");

        }
    }

    public StaklenaAmbalaza(double kaucija, boolean daliSePlacaKaucija, double osnovnaCena) {
        this.kaucija = kaucija;
        this.daliSePlacaKaucija = daliSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(String barcode, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija, boolean daliSePlacaKaucija, double osnovnaCena) {
        super(barcode, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daliSePlacaKaucija = daliSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

}
