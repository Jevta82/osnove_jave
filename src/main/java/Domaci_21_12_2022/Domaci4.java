package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {
        // Napisati program koji ucitava niz A duzine N i broj X.
        // Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.

        ArrayList<Integer> A = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        System.out.println("Unesite X: ");
        int x = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite brojeve");
            int m = s.nextInt();
            A.add(m);
        }
        for (int i = 0; i <n; i++) {
            if (A.get(i)==x)
            {
                System.out.println("index je :" + i);
            }
        }
    }
}
