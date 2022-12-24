package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci3DrugiNacin {
    public static void main(String[] args) {
        //Napisati program koji ucitava niz A duzine N,
        // i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.

        ArrayList<Integer> A = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzina niza : ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite elemente niza: ");
            int m = s.nextInt();
            A.add(m);
        }
        System.out.println("elemeti niza veci od nule su: ");
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > 0) {
                System.out.print(A.get(i) + " ,");
            }

        }
    }
}


