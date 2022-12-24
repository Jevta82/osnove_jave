package Domaci_20_12_2022;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        //Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu
        // ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..

        Scanner s = new Scanner(System.in);
        String rimsi = "";

        while (!rimsi.equals("kraj")) {
            System.out.println("Unesite broj Rimski:");
            rimsi = s.next();
            if (rimsi.equals("V")) {
                System.out.println("Za rimski broj: " + rimsi + "Arapski broj je 5" );
            } else
            if (rimsi.equals("I")) {
                System.out.println("Za rimski broj: " + rimsi + "Arapski broj je 1");
            } else
            if (rimsi.equals("X")) {
                System.out.println("Za rimski broj: " + rimsi + "Arapski broj je 10");
            } else
            if (rimsi.equals("C")) {
                System.out.println("Za rimski broj: " + rimsi + "Arapski broj je 50");
            } else
            if (rimsi.equals("D")) {
                System.out.println("Za rimski broj: " + rimsi + "Arapski broj je 500");
            } else
            if (rimsi.equals("M")) {
                System.out.println("Za rimski broj: " + rimsi + "Arapski broj je 1000");
            }
        }
        System.out.println("Kraj programa");
    }
}
