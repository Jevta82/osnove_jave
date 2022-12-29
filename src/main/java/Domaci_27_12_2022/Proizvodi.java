package Domaci_27_12_2022;

public class Proizvodi {
    public String naziv;
    public double cena;
    public double tezina;
    public String tezina1;

    public void print() {
        System.out.println(" {{" + this.naziv + "}}" + " ," + "{{" + this.cena + "}}" + " RSD, " + "{{" + this.tezina + "}} g" );

    }

    public double konvertuj (String tezina1) {
        if (tezina1.equals("kilogram")) {
            return this.tezina/1000;
        } else if (tezina1.equals("tona")) {
            return this.tezina/10000000;
        } return 0.0;
    }
}
