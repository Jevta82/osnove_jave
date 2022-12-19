package Domaci_19_12_2022;

import java.util.Random;
import java.util.Scanner;

public class Vezbanje5 {
    public static void main(String[] args) {

//Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
//Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se
// prikazuju dva random broja koja treba da sabere i poruka o tacnosti resenja.
// (Program generise random brojeve u opsegu od 0 do 50, ne unosi ih korisnik)
        Scanner s = new Scanner(System.in);

        Random random = new Random();

        int sum = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Koliko je : ");
            int x = random.nextInt(50);
            int y = random.nextInt(50);
            System.out.println(x + " + " + y);
            sum = x+y;
            System.out.println("Unesite Vase resenje: ");
            int sum1 = s.nextInt();
            if (sum == sum1) {
                System.out.println("Cestitam!");
            } else {
                System.out.println("Greska!");
        }

        }
    }
}

