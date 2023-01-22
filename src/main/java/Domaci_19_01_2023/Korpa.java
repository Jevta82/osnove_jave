package Domaci_19_01_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> nizAmbalaza;

    public ArrayList <Ambalaza> getNizAmbalaza() {
        return nizAmbalaza;
    }

    public void setNizAmbalaza(ArrayList<Ambalaza> nizAmbalaza) {
        this.nizAmbalaza = nizAmbalaza;
    }

    public Korpa() {
        this.nizAmbalaza = new ArrayList<>();
    }
    public void dodajAmabalazu (Ambalaza ambalaza){
        this.nizAmbalaza.add(ambalaza);
    }

    public void izbaciAmbalazu(String barcode){
        for (int i = 0; i <nizAmbalaza.size(); i++) {
            if (this.nizAmbalaza.get(i).getBarcode().equals(barcode)){
                this.nizAmbalaza.remove(i);
            }
        }
    }
    private double cenaAmbalaze (int popust){
        double cenaAmbalaze = 0;
        for (int i = 0; i <this.nizAmbalaza.size(); i++) {
            cenaAmbalaze = cenaAmbalaze + (this.nizAmbalaza.get(i).cena()-popust);
        } return cenaAmbalaze;
    }
    public double ukupnaCenaKorpe (SuperKartica kartica){
        double cenaKorpe=0;
        for (int i = 0; i <this.nizAmbalaza.size(); i++) {
            cenaKorpe = cenaKorpe + this.nizAmbalaza.get(i).cena();

        } return cenaKorpe - kartica.getPopust();
    }

}
