package Domaci_10_01_2023;

public class Domaci2 {
    public static void main(String[] args) {
        Proizvod cokolada = new Proizvod("Cokolada", 120);

        Kupac marko = new Kupac("Marko", "Jovanovic");

        ClanskaKarta karta = new ClanskaKarta(10, 12345);
        marko.setClanskaKarta(karta);
        cokolada.setMusterija(marko);
        cokolada.stampaj();



    }
}
