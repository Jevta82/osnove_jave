package p16_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Unesite poziciju a: ");
        int a =s.nextInt();
        System.out.println("Unesite poziciju b: ");
        int b=s.nextInt();
        char c ='*';
        char d ='_';

        for (int i = 0; i <a; i++) {
            System.out.print("*");
        }
        for (int i = a; i <b; i++) {
            System.out.print("_");
        }
        for (int i = b; i <20; i++) {
            System.out.print("*");
        }
    }
}
