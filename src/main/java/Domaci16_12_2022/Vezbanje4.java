package Domaci16_12_2022;

import java.util.Scanner;

public class Vezbanje4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dimenziju tabele: ");
        int dimezija = s.nextInt();
        String tabla = "_|";
        for (int i = 0; i <dimezija; i++) {

            for (int j = 0; j < dimezija; j++) {
                System.out.print(tabla);

            }
            System.out.println();
        }




    }
}
