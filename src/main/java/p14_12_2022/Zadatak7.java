package p14_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a : ");
        int a = s.nextInt();

        if (a < 10) {
            System.out.println("a je jednocifren broj");

        } else if (a < 100){
            System.out.println("a je dvocifren broj");
        } else {
            System.out.println("a je trocifren broj");
        }
    }
}
