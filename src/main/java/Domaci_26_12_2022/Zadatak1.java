package Domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
        // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost N: ");
        int n = s.nextInt();
        stampajVrednostZa10Vecu(n);

    }
    public static void stampajVrednostZa10Vecu (int n) {
        System.out.println("Vrednost broja n je: " + n*10);
    }

}
