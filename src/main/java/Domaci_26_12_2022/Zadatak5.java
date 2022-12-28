package Domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//Napomena: Metoda nista ne vraca.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj n");
        int n = s.nextInt();
        System.out.println("Unesite karakter koji zelite: ");
        String c = s.next();
        karakter(n,c);



    }

    public static void karakter (int n, String c) {
        for (int i = 0; i <n; i++) {
            System.out.print(c + " ");

        }
    }
}
