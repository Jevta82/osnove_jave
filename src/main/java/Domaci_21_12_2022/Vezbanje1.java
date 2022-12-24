package Domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Vezbanje1 {
    public static void main(String[] args) {
        //Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, formira
        // se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
        //a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)

        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n =s.nextInt();

        for (int i = 0; i <n; i++) {
            System.out.println("Unesi brojeve niza:");
            int m = s.nextInt();
            A.add(m);
            if (i<3) {
                B.add(m);
            } else {
                    B.add(1);
                }
            }
        System.out.println("Niz A: " + A);
        System.out.println("Niz B: " + B);
    }

    }

