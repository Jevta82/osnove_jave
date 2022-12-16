package Domaci_14_12_2022;

import java.util.Scanner;

public class Domaci_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji u zavisnosti od operatora koji unosi korisnik sa
        // tastature (operator je string i moze imati vrednosti +, - , *, /)
        // racuna  i ispisuje na ekranu odgovarajuci zbir,
        // razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.

        System.out.println("Unesite broj a: ");
        int a= s.nextInt();
        System.out.println("Unesite broj b: ");
        int b = s.nextInt();
        System.out.println("Unesite operaciju koju zelite da izvrsite: ");
        String operacija = s.next();

        if (operacija.equals("+")){
            System.out.println("Rezultat je: " + (a+b));
        } else if (operacija.equals("-")) {
            System.out.println("Rezultat je: " + (a-b));
        } else if (operacija.equals("*")) {
            System.out.println("Rezultat je: " + (a*b));
        } else if (operacija.equals("/")) {
            System.out.println("Rezultat je: " + (a/b));
        } else {
            System.out.println("Uneli ste pogresan operator!");
        }

    }
}
