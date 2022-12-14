package p14_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost stranice a: ");
        int a = s.nextInt();
        System.out.println("Unesite vrednost stranice b: ");
        int b = s.nextInt();
        System.out.println("Unesite vrednost stranice c: ");
        int c = s.nextInt();

                if (c*c == (a*a) + (b*b)) {
                    System.out.println("Trougao je pravogli");
                } else {
                    System.out.println("trougao nije pravougli");
                }


    }
}
