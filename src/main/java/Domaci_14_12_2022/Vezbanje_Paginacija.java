package Domaci_14_12_2022;

import java.util.Scanner;

public class Vezbanje_Paginacija {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Napisati program koji simulira paginaciju tabele. Korisnik sa tastature unosi:
//ukupan broj rezultata
//broj rezultata po strani
//stranu
//Program ispisuje poruku koji rezultati ce biti prikazani.
        System.out.println("Unesite broj rezultata");
        int broj = s.nextInt();
        System.out.println("Unesite broj rezultata po strani");
        int rezultati = s.nextInt();
        System.out.println("Unesite broj strane");
        int strane= s.nextInt();
        int brojStrana;
        //proveravamo da li imamo zadnju stranu sa manje elemenata
        if (broj/rezultati == 0) {
            brojStrana=broj/rezultati;
            //proveravamo da li je korisnik uneo postojecu stranu
            if (strane>brojStrana || strane < 1) {
                System.out.println("Nema rezultat");
            }
            // ispisujemo raspon rezultata za zadatu stranu
            else {
                System.out.println("Prikazuju se rezultati od " + ((strane - 1) * rezultati +1) + " do " + (((strane - 1) * rezultati + 1) + rezultati - 1));
            }
            }
        else {
            brojStrana=broj/rezultati+1;
            //proveravamo da li je korisnik uneo postojecu stranu
            if (strane>brojStrana || strane < 1) {
                System.out.println("Nema rezultat");
            }
            else {
                //proveravamo da li smo na zadnjoj strani
                if (strane == brojStrana) {
                    System.out.println("Prikazuju se rezultati od " + (broj - (broj % rezultati) + 1) + " do " + broj);
                } else
                //ispisujemo raspon rezultata za zadatu stranu
                {
                    System.out.println("Prikazuju se rezultati od " + ((strane - 1) * rezultati +1) + " do " + (((strane - 1) * rezultati + 1) + rezultati - 1));
                }
            }
        }
    }


}

