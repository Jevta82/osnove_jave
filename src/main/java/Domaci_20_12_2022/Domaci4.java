package Domaci_20_12_2022;

import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji proverava uparenost zagrada.
        // Korisnik unosi matematicku formulu sve dok ne unese znak =.
        // Korisnik unosi svaki karakter jednacine posebno i na kraju programa
        // se ispisuje da li su sve zagrade uparene.

        String operacija = "";
        int count1 = 0;
        int count2 = 0;

        while (!operacija.equals("=.")) {
            System.out.println("Unesite zeljenu oparaciju: ");
            operacija = s.next();
            if (operacija.equals("(")) {
                count1=count1+1;
            }
            if (operacija.equals(")")) {
                count2 = count2 + 1;
            }

        }
        if (count1==count2) {
            System.out.println("Zagrade su uparene!");
        } else {
            System.out.println("Zagrade nisu uparene!");
        }
    }
}
