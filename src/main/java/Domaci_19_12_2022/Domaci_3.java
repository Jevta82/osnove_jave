package Domaci_19_12_2022;

import java.util.Scanner;

public class Domaci_3 {
    public static void main(String[] args) {
//Napisati program koji simulira ponasanje speak loud programa.
// Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
//ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//ako se ne sadrzi, program dostampa na kraju
//	Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima).
//	Svaka uneta rec sa ! utice na agresivnost.
        Scanner s = new Scanner(System.in);

        System.out.println("Uneti N broj reci: ");
        int n = s.nextInt();
        double suma=0;
        for (int i = 0; i <n; i++) {
            System.out.println("Uneti proizvoljne reci: ");
            String rec = s.next();
            if (rec.contains("!")) {
                suma=suma+1;
                System.out.println(rec);
            } else {
                System.out.println(rec + "!");
            }

        }
        double procenat=(suma/n)*100;
        System.out.println("Nivo agresivnosti je :" + procenat + "%");

    }
}
