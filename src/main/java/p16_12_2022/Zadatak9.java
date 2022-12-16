package p16_12_2022;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzini video: ");
        int duzina = s.nextInt();
        System.out.println("Unesite trenutno vreme: ");
        int trenutno = s.nextInt();
        int procenat = trenutno*100/duzina;
        char c = '*';
        char d = '_';


        for (int i = 0; i < procenat ; i++) {
            System.out.print(c);
        }
        for (int i =procenat; i <100 ; i++) {
            System.out.print(d);


        }
        System.out.println();
        System.out.println(trenutno + "/" + duzina );
    }
}
