package Domaci_20_12_2022;

import java.util.Scanner;

public class domaci3 {
    public static void main(String[] args) {
        //Napisati program koji od korisnika ucitava brojeve sve dok ne
        // unesu bar dve dvojke ili tri jedinice.
        Scanner s = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;

        while (count1 < 2 && count2<3) {
            System.out.println("Unesite brojeve n: ");
           int n = s.nextInt();
            if (n == 1) {
                count1 = count1 + 1;
            }

            if (n == 2) {
                count2++;

        }
        if (count1 == 2) {
            System.out.println("Kraj jer je uneto dve 1");
        }
        }
        if (count2 == 3) {
            System.out.println("Kraj jer je uneto tri 2");
        }
        }
    }

