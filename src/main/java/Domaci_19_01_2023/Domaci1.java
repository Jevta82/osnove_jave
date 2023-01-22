package Domaci_19_01_2023;

public class Domaci1 {
    public static void main(String[] args) {

        Korpa idea = new Korpa();
        Tetrapak mleko = new Tetrapak("123456", "Mleko UHD",150, 170, true, 120);
        Tetrapak sok = new Tetrapak("23456", "Ananas 1l",100, 115, true, 180);
        Tetrapak kafa = new Tetrapak("220011", "Makijato",80, 100, true, 80);

        StaklenaAmbalaza pivo= new StaklenaAmbalaza("223344", "Nisko",500,620,50,true,120);
        StaklenaAmbalaza cocacola= new StaklenaAmbalaza("852741", "Coca Cola",300,350,0,false,100);
        StaklenaAmbalaza maslinovoUlje= new StaklenaAmbalaza("741523", "Maslinovo ulje",1000,1200,0,false,950);

        SuperKartica ideakartica = new SuperKartica("12345678","Aleksandar Jevtic", 300);

        idea.dodajAmabalazu(mleko);
        idea.dodajAmabalazu(sok);
        idea.dodajAmabalazu(kafa);
        idea.dodajAmabalazu(pivo);
        idea.dodajAmabalazu(cocacola);
        idea.dodajAmabalazu(maslinovoUlje);
        mleko.stampaj();
        sok.stampaj();
        kafa.stampaj();
        pivo.stampaj();
        cocacola.stampaj();
        maslinovoUlje.stampaj();

        System.out.println("Unesite karticu: ");
        ideakartica.stampaj();

        System.out.println("Cena sa popustom Super Kartice je: " + idea.ukupnaCenaKorpe(ideakartica));





    }
}
