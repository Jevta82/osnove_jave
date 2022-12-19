package Domaci_19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        //Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
        // Korisnik unosi N rekacija zatim se prikazuje evidencija:
        //Program podrzava sledece reakcije:
        //like
        //smile
        //heart

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj reci N: ");
        int n = s.nextInt();

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for (int i = 0; i <n; i++) {
            System.out.println("Unesite svoje rakcije: ");
            String reakcija = s.next();
            if (reakcija.equals("like")) {
                sumA=sumA+1;
            }
            if (reakcija.equals("smile")) {
                sumB=sumB+1;
            }
            if (reakcija.equals("heart")) {
                sumC=sumC+1;
            }
        }
        System.out.println("Summary: like " + sumA + "| smile " + sumB + "| heart " + sumC );
    }
}
