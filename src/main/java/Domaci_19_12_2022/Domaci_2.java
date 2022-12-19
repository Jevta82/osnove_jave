package Domaci_19_12_2022;

import java.util.Scanner;

public class Domaci_2 {
    public static void main(String[] args) {

        // Napisati program koji ucitava N brojeva od korisnika i
        // sabira samo trocifrene brojeve.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N brojeva: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 0; i <n; i++) {
            System.out.println("Unesite brojeve: ");
            int m = s.nextInt();
            if (m>=100 && m<1000) {
                suma = suma + m;
            }
        }
        System.out.println("Suma trocifrenih brojeva je: " + suma);
    }
}
