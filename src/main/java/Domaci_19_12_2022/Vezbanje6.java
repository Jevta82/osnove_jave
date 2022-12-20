package Domaci_19_12_2022;

import java.util.Scanner;

public class Vezbanje6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj x: ");
        int x = s.nextInt();
        String a = " |";
        String b = "c|";

        for (int i = 1; i <=25; i++) {
            if (i % 5 == 0) {
                System.out.println(a);
            } else if (i == x+1) {
                System.out.print(b);
            } else  {
                System.out.print(a);
            }
        }

    }
}


