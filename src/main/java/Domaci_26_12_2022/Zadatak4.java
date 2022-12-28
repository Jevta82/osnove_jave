package Domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Napisati metodu koja stampa podatke o korisniku u formatu:
        //JMBG: [jmbg]
        //Ime: [ime]
        //Prezime: [prezime]
        //God. rodjenja: [god]
        //Aktivan: [true/false]
        //Metoda prima jmbg, ime, prezime, god rodjenja
        // i da li je aktivan kao parametre metode.Metoda nista ne vraca.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite JMBG: ");
        String jmbg = s.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();
        System.out.println("Da li je korisnik aktivan? ");
        boolean aktivan=s.nextBoolean();
        podaci(jmbg, ime, prezime, godinaRodjenja,aktivan);


    }

    public static void podaci (String JMBG, String ime, String prezime,
                               int godinaRodjenja, boolean aktivan){
        System.out.println("Maticni broj je : " + JMBG);
        System.out.println("Ime i prezime : " + ime + " " + prezime);
        System.out.println("Godina rodjenja je: " + godinaRodjenja);
        if (aktivan){
        System.out.println("Korisnik je aktivan" );
    } else {
            System.out.println("Korisnik nije aktivan");}
    }
}
