package Domaci_14_12_2022;

import java.util.Scanner;

public class Vezbanje_Alarm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji simulira alarm :alarm_clock:.
        // Alarm se ponavlja na svakih 5minuta narednih pola sata.
        // Korisnik unosi sat i minut za koji zeli da navije alarm
        // a program prikazuje vremena u kojima ce se alarm aktivirati

        System.out.println("Unesite sat: ");
        int sat = s.nextInt();
        if (sat > 24 || sat<0) {
            System.out.println("Uneli ste neispravan format. Molimo Vas unosite broj izmedju 0 i 24");
            System.out.println("Unesite sat: ");
            sat = s.nextInt();
        }
           System.out.println("Unesite minut: ");
        int minut = s.nextInt();
        if (minut>60 || minut<0) {
            System.out.println("Uneli ste neispravan format. Molimo Vas unosite broj izmedju 0 i 60");
            System.out.println("Unesite minut: ");
            minut = s.nextInt();
        }
        System.out.println("Aktivirace se u \n" +sat+":"+minut);
        if (minut + 5 >= 60) {
            minut=minut+5-60;
            sat=sat+1;}
        else { minut=minut+5; }
        if (sat >= 24) {
            sat=00;
        }
        System.out.println(sat + ":" + minut);
        if (minut + 5 >= 60) {
            minut=minut+5-60;
            sat=sat+1;}
        else { minut=minut+5; }
        if (sat >= 24) {
            sat=00;
        }
        System.out.println(sat + ":" + minut);
        if (minut + 5 >= 60) {
            minut=minut+5-60;
            sat=sat+1;}
        else { minut=minut+5; }
        if (sat >= 24) {
            sat=00;
        }
        System.out.println(sat + ":" + minut);
        if (minut + 5 >= 60) {
            minut=minut+5-60;
            sat=sat+1;}
        else { minut=minut+5; }
        if (sat >= 24) {
            sat=00;
        }
        System.out.println(sat + ":" + minut);
        if (minut + 5 >= 60) {
            minut=minut+5-60;
            sat=sat+1;}
        else { minut=minut+5; }
        if (sat >= 24) {
            sat=00;
        }
        System.out.println(sat + ":" + minut);





    }
}
