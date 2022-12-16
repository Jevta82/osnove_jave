package Domaci16_12_2022;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jednocifren broj: ");
        int broj = s.nextInt();

        for (int i = 1; i <=broj; i++) {
            int d = broj*i;
            System.out.println(broj + "*" +i + "=" + d);
        }
    }
}
