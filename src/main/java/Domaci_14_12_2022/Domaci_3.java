package Domaci_14_12_2022;

import java.util.Scanner;

public class Domaci_3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        //Napisati program koji proverava da li je kliknuto u okviru login forme
        // za web stranicu.
        // Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

        System.out.println("Unesite vrednost za koordinatu x: ");
        int x = s.nextInt();
        System.out.println("Unesite vrednost za koordinatu y: ");
        int y = s.nextInt();
        System.out.println("Unesite vrednost za koordinatu x1: ");
        int x2 = s.nextInt();
        System.out.println("Unesite vrednost za koordinatu y1: ");
        int y2 = s.nextInt();
        System.out.println("Unesite vrednost za koordinatu x2: ");
        int x3 = s.nextInt();
        System.out.println("Unesite vrednost za koordinatu y2: ");
        int y3 = s.nextInt();
        if ((x3>x || x3<x2) && (y3>y || y3<y2)) {
            System.out.println("Kliknuto je unutar polja");
        } else {
            System.out.println("Kliknuto je van polja");
        }


    }
}
