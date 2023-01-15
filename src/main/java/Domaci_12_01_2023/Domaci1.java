package Domaci_12_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
//Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
        ArrayList<ZeleniKarton> imena = new ArrayList<ZeleniKarton>();
        ZeleniKarton ime1 = new ZeleniKarton("Aleksandar Jevtic", "12345", "Teorija o nastanku coveka", "Milan Jovanovic", 5);
        ZeleniKarton ime2 = new ZeleniKarton("Marko Jovanovic", "22331", "Teorija o nastanku coveka", "Milan Jovanovic", 7);
        ZeleniKarton ime3 = new ZeleniKarton("Ana Janjic", "11223", "Teorija o nastanku coveka", "Milan Jovanovic", 6);
        ZeleniKarton ime4 = new ZeleniKarton("Marija Petronijevic", "14526", "Teorija o nastanku coveka", "Milan Jovanovic", 10);
        ZeleniKarton ime5 = new ZeleniKarton("Milan Jovanovic", "1421", "Programiranje", "Goran Milicevic", 10);
        ZeleniKarton ime6 = new ZeleniKarton("Vuk Buduric", "1001", "Programiranje", "Goran Milicevic", 6);
        ZeleniKarton ime7 = new ZeleniKarton("Vojislav Buduric", "2221", "Programiranje", "Goran Milicevic", 5);
        ZeleniKarton ime8 = new ZeleniKarton("Stana Buduric", "4253", "Programiranje", "Goran Milicevic", 8);
        ZeleniKarton ime9 = new ZeleniKarton("Mitra Jevtic", "5555", "Programiranje", "Goran Milicevic", 6);
        ZeleniKarton ime10 = new ZeleniKarton("Blagica Stojanovic", "7425", "Programiranje", "Goran Milicevic", 10);



        imena.add(ime1);
        imena.add(ime2);
        imena.add(ime3);
        imena.add(ime4);
        imena.add(ime5);
        imena.add(ime6);
        imena.add(ime7);
        imena.add(ime8);
        imena.add(ime9);
        imena.add(ime10);



        double prosecnaOcena=0;
        double suma = 0;
        double count = 0;

        for (int i = 0; i <imena.size(); i++) {
            System.out.println(imena.get(i).getImePrezime() + " " + imena.get(i).getBrojIndexa() + " " + imena.get(i).getNazivPredmeta() + " " + imena.get(i).getImePrezimeProfesora() + " " + imena.get(i).getOcena());
            if (imena.get(i).getOcena()==5) {
                System.out.println(" Pao ");
            } else {
                suma = suma + imena.get(i).getOcena();
                count ++;
                System.out.println(" Polozio ");

            }
            prosecnaOcena = suma/count;


        }
        System.out.println("Prosecna ocena je " + prosecnaOcena);




    }
}
