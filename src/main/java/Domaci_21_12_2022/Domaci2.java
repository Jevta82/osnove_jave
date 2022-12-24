package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        //Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim,
        // iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.

        ArrayList<Integer>brojevi= new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza:");
        int n = s.nextInt();
        int count = 0;

        for (int i = 0; i <n; i++) {
            System.out.println("Unesite broj");
            int m = s.nextInt();
            brojevi.add(i, m);
            if (m%2==0) {
                count++;
            }
        }
        System.out.println(brojevi);
        System.out.println("U nizu ima " + count + " parna broja");
    }
}
