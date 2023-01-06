package Domaci_29_12_2022;

public class Vezbanje {
    public static void main(String[] args) {


        SmartAirConditioning klima = new SmartAirConditioning();
        klima.markaKlime = "Midea";
        klima.trenutnaTemperatura = 28;
        klima.potrosnjaHladi = 1;
        klima.potrosnjaGreje = 2;
        klima.mod = "greje";

        klima.stampaj();

        System.out.println("Mesecna potrosnja je: " + klima.mesecnaPotrosnja() + " kW/h");
        System.out.println("Ukupna cena za mesec je: " + klima.mesecnaCena() + " Dinara");

    }
}
