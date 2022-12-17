package Domaci_14_12_2022;

import java.util.Scanner;

public class Vezbanje8 {
    public static void main(String[] args) {
        //Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu..
        // Kada se ucita video difoltna jacina zvuka je 75.
        //Korisnik unosi akciju sa tastature. Jednu od sledecih:
        //pojacaj - pojacava zvuka za 10
        //smanji - smanjuje zvuk za 10.
        //mute - postavlja zvuk na 0.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite zeljenu akciju: ");
        String a = s.next();
        int d = 75;

        if (a.equals("pojacaj")) {
            System.out.println("Nova jacina zvuka je: " + (d+10));
        } else if (a.equals("smanji")){
            System.out.println("Nova jacina zvuka je: " + (d-10));
        } else if (a.equals("mute")) {
            System.out.println("Nova jacina zvuka je: 0");

        }






    }
}
