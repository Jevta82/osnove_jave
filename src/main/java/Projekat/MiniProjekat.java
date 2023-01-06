package Projekat;

import java.util.Scanner;

public class MiniProjekat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        XOTabla xotabla = new XOTabla();
        System.out.println("Unesite ime igraca X: ");
        xotabla.setImeXIgraca(s.next());
        System.out.println("Unesite ime igraca O: ");
        xotabla.setImeOIgraca(s.next());

        String prviNaPotezu;
        int broj;
        xotabla.pokreniIgra();

        while (!xotabla.popunjenaTabla() && !xotabla.pobednikX() && !xotabla.pobednikO()) {
            xotabla.stampaj();
            prviNaPotezu = xotabla.getNaPotezu();
            System.out.println(" Na potezu je igrac: " + prviNaPotezu);
            broj = s.nextInt();
            if (!xotabla.poljePrazno(broj)) {
                System.out.println("Uneli ste pogresno polje, unesite ponovo: ");

            } else {
                xotabla.odigrajPotez(broj);
                xotabla.zameniIgraca();
                xotabla.stampaj();
            }


        }
        if (xotabla.popunjenaTabla() && !xotabla.pobednikX() && !xotabla.pobednikO()) {
            System.out.println("Nereseno je!!!");
        }
        if (xotabla.pobednikX()) {
            System.out.println("Pobednik je igrac X : "  + xotabla.getImeXIgraca());
        }
        if (xotabla.pobednikO()) {
            System.out.println("Pobednik je igrac O : " + xotabla.getImeOIgraca());
        }
    }
}
