package Domaci_21_12_2022;

import java.util.Scanner;

public class VezbanjeSlack1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String unosblocka="";
        System.out.println("Unesite velicinu fajla: ");
        int fajl = s.nextInt();
        int duzina = 0;
        int celaduzina=0;
        String ceoFajl = "";

        while (celaduzina<fajl) {
            System.out.println("Unesite deo fajla: ");
            unosblocka = s.next();
            ceoFajl = ceoFajl + unosblocka ;
            duzina = unosblocka.length();
            celaduzina = celaduzina + duzina;

            if (celaduzina<fajl) {
                System.out.println("Duzina block-a je: " + celaduzina);
                System.out.println("Downloaded " + ((celaduzina*100)/(fajl))  + " %");
            } else {
                System.out.println("Duzina block-a je: " + fajl);
                System.out.println("Sadrzaj skinutog fajla je :" + ceoFajl);
                System.out.println("Downloaded 100% ");
                System.out.println("Fajl je skinut :-)");
            }
        }
    }
}


