package Domaci_14_12_2022;

import java.util.Scanner;

public class Vezbanje92 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu.. Kada se ucita video difoltna jacina zvuka je 75.
        //Korisnik unosi 5 akcija. Jednu od sledecih:
        //pojacaj - pojacava zvuka za 10
        //smanji - smanjuje zvuk za 10.
        //mute - postavlja zvuk na 0.
        //Na kraju programa odstampati jacinu zvuka.
        //NAPOMENA: Jacina zvuka nikad ne moze da ode iznad 100 niti da padne ispod 0.

        int g = 75;
        System.out.println("Unesite zeljenju akciju: ");
        String a = s.next();

        if (a.equals("pojacaj")) {
            g = g + 10;
        }
        if (a.equals("smanji")) {
            g = g - 10;
        }
        if (a.equals("mute")) {
            g = 0;
        }
        if (g < 0) {
            g=0;
            System.out.println("Jacina  zvuka je: 0");
        } else if (g > 100) {
            g=100;
            System.out.println("Jacina  zvuka je: 100");
        } else {
            System.out.println("Jacina zvuka je: " + g);
        }
        System.out.println("Unesite zeljenju akciju: ");
        String b = s.next();
        if (b.equals("pojacaj")) {
            g = g + 10;
        }
        if (b.equals("smanji")) {
            g = g - 10;
        }
        if (b.equals("mute")) {
            g = 0;
        }

        if (g < 0) {
            g=0;
            System.out.println("Jacina  zvuka je: 0");
        } else if (g > 100) {
            g=100;
            System.out.println("Jacina  zvuka je: 100");
        } else {
            System.out.println("Jacina zvuka je: " + g);
        }
        System.out.println("Unesite zeljenju akciju: ");
        String c = s.next();
        if (c.equals("pojacaj")) {
            g = g + 10;
        }
        if (c.equals("smanji")) {
            g = g - 10;
        }
        if (c.equals("mute")) {
            g = 0;
        }
        if (g < 0) {
            g=0;
            System.out.println("Jacina  zvuka je: 0");
        } else if (g > 100) {
            g=100;
            System.out.println("Jacina  zvuka je: 100");
        } else {
            System.out.println("Jacina zvuka je: " + g);
        }
        System.out.println("Unesite zeljenju akciju: ");
        String d = s.next();
        if (d.equals("pojacaj")) {
            g = g + 10;
        }
        if (d.equals("smanji")) {
            g = g - 10;
        }
        if (d.equals("mute")) {
            g = 0;
        }
        if (g < 0) {
            g=0;
            System.out.println("Jacina  zvuka je: 0");
        } else if (g > 100) {
            g=100;
            System.out.println("Jacina  zvuka je: 100");
        } else {
            System.out.println("Jacina zvuka je: " + g);
        }
        System.out.println("Unesite zeljenju akciju: ");
        String e = s.next();
        if (e.equals("pojacaj")) {
            g = g + 10;
        }
        if (e.equals("smanji")) {
            g = g - 10;
        }
        if (e.equals("mute")) {
            g = 0;
        }
        if (g < 0) {
            g=0;
            System.out.println("Jacina  zvuka je: 0");
        } else if (g > 100) {
            g=100;
            System.out.println("Jacina  zvuka je: 100");
        } else {
            System.out.println("Jacina zvuka je: " + g);
        }
    }
}

