package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Vezbanje2 {
    public static void main(String[] args) {
//Napisati program koji ucitava
// niz stringova duzine N, tako da ucitavanje elemenata u niz a bude obrnuto.
        ArrayList<String> A = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i <n; i++) {
            System.out.println("Unesite stringove:");
            String niz = s.next();
            A.add(niz);
        }
        System.out.println("Originalan niz je " + A);
        System.out.print("Niz u obrnutom redosledu je: ");
        for (int i =n-1; i>=0; i--) {
            System.out.print(A.get(i) + ",");
        }



    }
}
