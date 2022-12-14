package p14_12_2022;

import java.util.Scanner;

public class UvodGrananje2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj a: ");
        int a = s.nextInt();
        System.out.println("Unesite broj b: ");

        int b = s.nextInt();

        if (b < a) {
            System.out.println("B je manje od a");
        } else {
            System.out.println("B je vece od a");
        }
    }
    }
