package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci3 {
    public static void main(String[] args) {
        //Napisati program koji ucitava niz A duzine N,
        // i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
        ArrayList<Integer> A= new ArrayList<Integer>();
        ArrayList<Integer> B= new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N");
        int n = s.nextInt();

        for (int i = 0; i <n; i++) {
            System.out.println("Unesite brojeve");
            int m = s.nextInt();
            A.add(m);
            if (m>0) {
                B.add(m);
            }
        }
        System.out.println("Elementi niza veci od 0 su: "  + B);
    }
}
