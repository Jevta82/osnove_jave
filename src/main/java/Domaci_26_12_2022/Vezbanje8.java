package Domaci_26_12_2022;

import java.util.Scanner;

public class Vezbanje8 {
    public static void main(String[] args) {
        //Napisati funkciju koja za tri prosledjena broja vraca
        // najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj a: ");
        int a = s.nextInt();
        System.out.println("Unesite broj b: ");
        int b = s.nextInt();
        System.out.println("Unesite broj c: ");
        int c = s.nextInt();

        int d = najmanji(a,b,c);
        if (d==0) {
            System.out.println("Brojevi su jednaki!");
        } else {
            System.out.println("Najmanji broj od tri ponudjenja je : " + d);
        }


    }

    public static int najmanji(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if (b < a && b < c) {
            return b;
        }
        if (c < a && c < b) {
            return c;
        }
        return 0;
    }
}


