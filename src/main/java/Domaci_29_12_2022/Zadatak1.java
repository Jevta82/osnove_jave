package Domaci_29_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //Napisati klasu Proizvod koja ima atribute
        //naziv proizvoda (String)
        //cenu proizvoda (double)
        //težinu proizvoda u gramima. (double)
        //	i metode:
        //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
        //povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
        //vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
        //racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
        //za tezinu do 100g, postarina iznosi 200din
        //za tezinu od 101g do 500g, postarina iznosi 400din
        //za tezinu preko 500g, postarina iznosi 1000din
        //
        //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
        Scanner s = new Scanner(System.in);
        double x= 0;
        int y = 0;


        Proizvod cokolada = new Proizvod();
        cokolada.naziv = " Milka";
        cokolada.cena = 200.00;
        cokolada.tezina = 300.00;
        cokolada.stampaj();

        Proizvod banana = new Proizvod();
        banana.naziv = "Derby";
        banana.cena = 450;
        banana.tezina = 500;
        System.out.println("Za koliko  povecati cenu proizvoda? :" + cokolada.naziv);
         x = s.nextInt();
        cokolada.povecajCenu(x);
        System.out.println("Nova cena proizvoda je: ");
        cokolada.stampaj();
        System.out.println("Koliki je popust na proizvodu?:");
        y = s.nextInt();
        System.out.println("Cena sa popustom je: " + cokolada.popust(y));
        System.out.println("Vrednost postarine je : " + cokolada.racunajPostarinu());

        System.out.println("Za koliko  povecati cenu proizvoda? :" + banana.naziv);
        x = s.nextInt();
        banana.povecajCenu(x);
        System.out.println("Nova cena proizvoda je: ");
        banana.stampaj();
        System.out.println("Koliki je popust na proizvodu?:");
        y = s.nextInt();
        System.out.println("Cena sa popustom je: " + banana.popust(y));
        System.out.println("Vrednost postarine je : " + banana.racunajPostarinu());


    }
}
