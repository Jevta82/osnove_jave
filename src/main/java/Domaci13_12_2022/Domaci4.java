package Domaci13_12_2022;

public class Domaci4 {
    public static void main(String[] args) {
//  Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//  KOREN BROJA 3 neka bude konstanta 1.73.
//  Za stranicu trougla postavite proizvoljnu vrednost.
//Primer izvrsenja programa:
//a: 10
//Povrsina je 43.25
//Obim je 30
        double a = 14;
        double koren3 = 1.73;
        double povrsinaTrougla = (a * a * koren3)/4;
        double obimKruga = a + a + a;

        System.out.println("Vrednost stranice je: " + a);
        System.out.println("Povrsina trougla je: " + povrsinaTrougla);
        System.out.println("Obim kruga je: " + obimKruga);
    }
}
