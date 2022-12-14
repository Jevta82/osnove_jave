package p14_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Jacina zvuka je 75");
        int a = 75;
        System.out.println("Unesite akciju:");
        String pojacaj = s.next();


        if (pojacaj.equals("pojacaj")) {
            System.out.println("Nova jacina zvuka je" + " " + (a + 10));

        } else if (pojacaj.equals("smanji")) {
            System.out.println("Nova jacina zvuka je" + " " + (a - 10));
        } else if (pojacaj.equals("mute")) {
            System.out.println("Nova jacina zvuka je 0 " );
        } else {
            System.out.println("Nista nisi promeni");
        }




    }
}
