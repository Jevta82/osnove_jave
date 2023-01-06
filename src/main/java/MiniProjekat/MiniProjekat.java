package MiniProjekat;

import java.util.Scanner;

public class MiniProjekat {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String ime;
        int broj;
        String m = "X";

        XOTabla xotabla = new XOTabla();
        System.out.println("Unesite ime X igraca: ");
        xotabla.setImeXIgraca(ime = s.next());
        System.out.println("Unesite ime O igraca: ");
        xotabla.setImeOIgraca(ime = s.next());
        System.out.println("Igraci su : " + xotabla.getImeXIgraca() + " I " + xotabla.getImeOIgraca());
        xotabla.stampaj();
        xotabla.pokreniIgru();

        xotabla.popunjenaTabla();
        xotabla.pobednikX();
        xotabla.pobednikO();


        while(!xotabla.popunjenaTabla() && !xotabla.pobednikX() && !xotabla.pobednikO()) {
            xotabla.stampaj();
            String igrac=xotabla.getnaPotezu();
            System.out.println("Sledeci na potezu je "+igrac+". Unesite polje koje zelite da odigrate: ");
            int polje= s.nextInt();

            if (!xotabla.poljePrazno(polje)) {

                System.out.println("Potez nije validan!");
            } else {
                xotabla.odigrajPotez(polje);
                xotabla.zameniIgraca();
            }
        }
        if (xotabla.pobednikX()){
            System.out.println("Pobednik je X.");
        }
        else if (xotabla.pobednikO()){
            System.out.println("Pobednik je O.");
        } else {
            System.out.println("Nereseno je.");
        }
        }


            }






