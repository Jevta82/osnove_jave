package p16_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati porogram koji od korisnika ucitava dva broja M i N i
        // stampa sve brojeve izmedju M i N. Smatrajte da je M manje od N.
        //Primer izvrsenja:
        //Unesite M: 10
        //Unesite N: 15
        //10, 11, 12, 13, 14, 15,

        Scanner s= new Scanner(System.in);
        System.out.println("Unesite broj m: ");
        int M = s.nextInt();
        System.out.println("Unesite broj n: ");
        int N = s.nextInt();

        for (int i = M; i <N; i++) {
            System.out.println(i+ ",");
        }
    }
}
