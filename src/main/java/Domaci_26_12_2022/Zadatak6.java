package Domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole
// navedenoj konverziji. Metoda od parametara prima vrednost u eurima kao i valutu
// u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
// U glavnom programu pozvati funkciju za neki od primera.
//Primer poziva funkcija:
//Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//Primer izvrsenja main programa:
//Unesite vrednost u eurima: 3
//Unesite valutu za konverziju: RSD
//3 EUR je 351.6339 RSD
//Konverzija eura u druge valute:
//1 EUR = 117.5 RSD
//1 EUR = 1.1 USD
//1 EUR = 62.98 RUB
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u eurima: ");
        double novac = s.nextDouble();
        System.out.println("Unesite valutu za konverziju: ");
        String konverzija = s.next();

        double vrednost = valuta(novac, konverzija);
        System.out.println("Vrednost " + novac + " eura je : " + vrednost + " " + konverzija);

    }

    public static double valuta(double novac, String valuta) {
        if (valuta.equals("RSD")) {
            return novac*117.5;
        } else if (valuta.equals("USD")) {
            return novac*1.1;
        } else if (valuta.equals("RUB")) {
            return novac*62.98;
        } else {
            return 0;
        }
    }
}



