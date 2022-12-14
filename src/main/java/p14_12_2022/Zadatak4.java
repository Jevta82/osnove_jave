package p14_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj a: ");
        int a = s.nextInt();
        System.out.println("Unesite broj b: ");

        int b = s.nextInt();

        if (a > b) {
            System.out.println("Broj : " + b + " je manji od " + a);
        }
    }
}
