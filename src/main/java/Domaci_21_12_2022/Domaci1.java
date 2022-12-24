package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {

        //Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
        // i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.

        ArrayList<Integer>brojevi= new ArrayList<Integer>();


        brojevi.add (15);
        brojevi.add(20);
        brojevi.add(5);
        brojevi.add(14);
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(7);
        brojevi.add(6);
        System.out.println(brojevi);

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost K: ");
        int k = s.nextInt();
        System.out.println("Unesite broj N za zamenu u nizu: ");
        int n = s.nextInt();

        brojevi.set(k, n);
        System.out.println(brojevi);
    }
}
