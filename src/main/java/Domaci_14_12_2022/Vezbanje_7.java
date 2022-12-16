package Domaci_14_12_2022;

import java.util.Scanner;

public class Vezbanje_7 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        //Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p
        // (p ima startni deo #) tako sto negativne brojeve lepi sa leve
        // strane a pozitivne i nulu sa desne.
        String p ="#";
        System.out.println("Unesite broj a: ");
        int a = s.nextInt();
        if (a < 0) {
            p = a + p;
        } else {
            p = p + a;
        }
        System.out.println("Unesite broj b: ");
        int b= s.nextInt();
        if (b < 0) {
            p = b + p;
        } else {
            p = p + b;
        }
        System.out.println("Unesite broj c: ");
        int c= s.nextInt();
        if (c < 0) {
            p = c + p;
        } else {
            p = p + c;
        }
        System.out.println("Unesite broj d: ");
        int d= s.nextInt();
        if (d < 0) {
            p = d + p;
        } else {
            p = p + d;
        }
        System.out.println(p);
    }
}
