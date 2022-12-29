package Domaci_27_12_2022;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        //Napisati klasu Proizvod koja ima atribute
        //naziv proizvoda (String)
        //cenu proizvoda (double)
        //težinu proizvoda u gramima. (double)
        //	i metode:
        //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
        //konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
        //Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
        //Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
Scanner s = new Scanner(System.in);
        Proizvodi jabuka = new Proizvodi();
        jabuka.naziv = "Delises";
        jabuka.cena = 125.50;
        jabuka.tezina = 1200;
        jabuka.print();
        System.out.println("U koju vrednost zelite da konvertujete grame? ");
        String konvert = s.next();
        System.out.println("Tezina u " + konvert + " iznosi " + jabuka.konvertuj(konvert));

        Proizvodi banana = new Proizvodi();
        banana.naziv = "Cavendish";
        banana.cena = 450;
        banana.tezina = 2500;
        banana.print();
        System.out.println("U koju vrednost zelite da konvertujete grame? ");
        konvert = s.next();
        System.out.println("Tezina u " + konvert + " iznosi " + banana.konvertuj(konvert));








    }
}
