package Domaci16_12_2022;

import java.util.Scanner;

public class Vezbanje4DrugiNacin {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Unesite vrednost tabele: ");
        int x = s.nextInt();
        String c = "_|";

        for (int i = 1; i <=x*x; i++) {
            System.out.print(c);
            if (i%x == 0) {
                System.out.println();
            }

        }
    }
}
