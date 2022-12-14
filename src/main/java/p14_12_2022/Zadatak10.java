package p14_12_2022;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite zeljeni broj: ");
        double a = s.nextDouble();

        if (a%2 == 0 && a%3 == 0){
            System.out.println("Broj a je deljiv sa 2 i 3");

        } else {
            System.out.println("Broj a nije deljiv sa 2 i 3");
        }
    }
}
