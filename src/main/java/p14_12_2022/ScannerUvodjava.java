package p14_12_2022;

import java.util.Scanner;

public class ScannerUvodjava {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost za a: ");
        int a = s.nextInt();
        System.out.println("Unesite vrednost za b: ");

        int b = s.nextInt();
        int sum = a + b;
        System.out.println("Unesite ime");
        String ime = s.next();
        System.out.println("Unesite prezime");
        String prezime = s.next();
        boolean unetBoolean = s.nextBoolean();
        System.out.println("Suma a + b je:" + sum );
        System.out.println("  ime i prezime:  " + ime + prezime);




    }
}
