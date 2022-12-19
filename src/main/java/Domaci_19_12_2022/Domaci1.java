package Domaci_19_12_2022;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {

        //Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve.
        // Na kraju programa prikazati sumu.

        Scanner s= new Scanner(System.in);
        System.out.println("Koliko N brojeva zelite da uneste : ");
        int n = s.nextInt();
        int suma=0;

        for (int i = 1; i <=n; i++) {
            System.out.println("Unesite brojeve: ");
            int m = s.nextInt();
            if (m%2==0) {
            suma = suma + m;}

        }
        System.out.println("Suma parnih brojeva je: " + suma);
    }
}
