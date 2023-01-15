package Domaci_13_01_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Student> ispiti = new ArrayList<>();
        Student aleksandar = new Student(1234, "Aleksandar Jevtic", "osnovne");

        Ispit matematika = new Ispit("matematika",6, "Pavlina Nikolic");
        Ispit hemija = new Ispit("hemija",8, "Ana Marinkovic");
        Ispit fizika = new Ispit("fizika",9, "Marko Miloradovic");
        Ispit programiranje = new Ispit("programiranje",7, "Goran Knezevic");
        Ispit geografija = new Ispit("geografija",6, "Milan Jovanovic");




        aleksandar.dodajIspit(matematika);
        aleksandar.dodajIspit(hemija);
        aleksandar.dodajIspit(fizika);
        aleksandar.dodajIspit(programiranje);
        aleksandar.dodajIspit(geografija);
aleksandar.prosek();
        aleksandar.stampaj();


    }
}
