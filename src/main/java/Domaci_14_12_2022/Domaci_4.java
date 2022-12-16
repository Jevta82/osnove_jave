package Domaci_14_12_2022;

import java.util.Scanner;

public class Domaci_4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Napisati program koji za unetu vrednost x odredjuje i
        // prikazuje vrednost funkcije y. Iskoristite if/else za
        // racunanje informacije i tek nakon te logike odstampajte
        // vrednost y na ekranu.Funkcija y je definisana kao:
        //    			       (x,       x < 2
        //y =  (2,      2 <= x < 10
        //    			       (x - 1, x >= 10

        System.out.println("Unesite vrednost x:");
        int x = s.nextInt();

        if (x<2) {
            System.out.println("Vrednost y je: " + x);
        } else if (x>=2 && x<10){
            System.out.println("Vrednost y je: " + " 2 " );
        } else if (x>=10){
            System.out.println("Vrednost y je: " + (x-1));
        }

    }
}
