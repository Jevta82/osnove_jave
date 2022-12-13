package p13_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//  Napisati program koji na ekranu stampa podatke u formatu:
//Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]

        String sifraProizvoda = "12345";
        String nazivProizvoda = "Cokolada";
        double cena = 23.5;
        int popust = 10;
        String boja = "crna";
        int velicina = 100;

        System.out.println("sifra proizvoda" + "-" + sifraProizvoda);
        System.out.println(nazivProizvoda + " -" + "$" + cena +
                " -" + popust + "%");
        System.out.println(boja + " " + velicina + " g");




    }
}
