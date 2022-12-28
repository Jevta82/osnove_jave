package Domaci_26_12_2022;

import java.util.Scanner;

public class Vezbanje7 {
    public static void main(String[] args) {
//)Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//Napomena: Resiti bez koriscenja petlji.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj M: ");
        int m = s.nextInt();
        System.out.println("Unesite broj N : ");
        int n = s.nextInt();
        izmedju(m, n);

    }

    public static void izmedju(int m, int n) {
        if (m > n) {
            if (m >= 0 && n >= 0) {
                System.out.println("Izmedju ova dva broja ima : " + (m - n - 1));
            } if (m >= 0 && n < 0) {
                System.out.println("Izmedju ova dva broja ima : " + (m + (-n) - 1));
            } if (m < 0 && n >= 0) {
                System.out.println("Izmedju ova dva broja ima : " + (-m + n - 1));
            }
            }
        if (m < n){
            if (m >= 0 && n >= 0) {
                System.out.println("Izmedju ova dva broja ima : " + (n - m - 1));
            }  if (m < 0 && n >= 0) {
                System.out.println("Izmedju ova dva broja ima : " + (n + (-m) - 1));
            }  if (m >= 0 && n < 0) {
                System.out.println("Izmedju ova dva broja ima : " + (-n + m - 1));
            }
        }
    }
}
