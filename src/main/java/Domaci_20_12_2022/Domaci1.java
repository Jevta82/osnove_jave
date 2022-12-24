package Domaci_20_12_2022;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
       // pisati program koji ucitava brojeva od korisnika i
        // za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
        Scanner s=new Scanner(System.in);

        boolean n = true;
        int m=1;

        while (n) {
            System.out.println("Unesite broj n: ");
            m = s.nextInt();
            if (m<0) {
                m=(m*(-1));
            }
            if (m==0) {
                 n = false;
                System.out.println("Kraj programa!");
            }
            System.out.println("Apsolutna vreDnost broja je: " + m);
        }


        }

    }
