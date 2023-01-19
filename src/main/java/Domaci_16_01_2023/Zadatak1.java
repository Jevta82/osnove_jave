package Domaci_16_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//1.Zadatak
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
        Igrac prvi = new Igrac("Aleksandar Jevtic", "0304982954788", 1982, 25, "bek",false);
        Igrac drugi = new Igrac("Goran Knezevic", "1103990745698", 1990, 9, "levo krilo",false);

        Trener prvi1 = new Trener("Marko Jovanovic", "0208982457866", 1982, 36, "personalni");
        Trener drugi1 = new Trener("Miodrag Markovic", "1105970258789", 1970, 30, "pomocni");

        prvi.setKapiten(true);
        prvi.stampaj();
        drugi.stampaj();
        drugi.stampaj();
        drugi1.stampaj();
    }
}
