package p16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        //Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10)
        // i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
        //Primer izvrsenja;
        //Unesite jacinu zvuka: 8
        //< | | | | | | | |
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jacinu zvuka od 0 do 10");
        int m = s.nextInt();

        if (m == 0) {
            System.out.println("</");
            }

        System.out.print("<");
        for (int i = 0; i <m; i++) {
            System.out.print ("|"+ " ");
        }

        }
    }

