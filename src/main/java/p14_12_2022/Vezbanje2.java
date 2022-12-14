package p14_12_2022;

import java.util.Scanner;

public class Vezbanje2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite znak karte na stolu: ");
        String znakKarte = s.next();

        System.out.println("Unesite broj karte: ");
        String brojKarte = s.next();

        System.out.println("Unesite znak karte koju igrate: ");
        String znakKarteIgra = s.next();

        System.out.println("Unesite broj karte koju zelite da pdigrate: ");
        String brojKarte1 = s.next();

        if (znakKarte.equals(znakKarteIgra) && brojKarte.equals(brojKarte1)) {
            System.out.println("Potez je validan");
        } else {
            System.out.println("Potez nije validan");
        }




    }
}
