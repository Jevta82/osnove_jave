package Domaci_16_01_2023;

public class Vezbanje {
    public static void main(String[] args) {
        Karton prvi = new Karton();
        prvi.setTipKartona("zuti");
        Karton drugi = new Karton();
        drugi.setTipKartona("crveni");
        Karton treci = new Karton();
        treci.setTipKartona("crveni");

        Igrac1 aleksandar = new Igrac1("Aleksandar Jevtic", "0304982954788", 1982, 22, "bek", true);
        aleksandar.dodajKarton(prvi);
        aleksandar.dodajKarton(drugi);
        aleksandar.dodajKarton(treci);
        aleksandar.setKapiten(false);


        aleksandar.stampaj();




        }
    }

