package Domaci_29_12_2022;

public class Proizvod {


    public String naziv;
    public double cena;
    public double tezina;


    public void stampaj () {
        System.out.println("{{" + this.naziv+ "}} " + " {{" + this.cena + "}} dinara " + " {{" + this.tezina + "}} grama" );
    }
    public void povecajCenu (double x) {
        this.cena = this.cena + x;
    }
    public  double popust (int y) {
        this.cena = this.cena - (this.cena * y/100);
        return this.cena;
    }
    public double racunajPostarinu () {
        if (this.tezina <= 100.00) {
            return 200;
        } else if (this.tezina > 100 && this.tezina < 400) {
            return 400;
        } else {
            return 1000;
        }
    }

}
