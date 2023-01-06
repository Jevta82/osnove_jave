package Domaci_29_12_2022;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ocena = "";
        String share = "";

        FacebookPost post = new FacebookPost();
        post.setImeIprezimePost("Aleksandar");
        post.setImeiPrezimeObjava("Marko");
        post.setTekstObjave("Kako si? Sta radis?");
        post.likes();
        post.likes();
        post.dislake();
        post.likes();
        post.likes();
        post.deljenje();
        post.deljenje();

        FacebookPost post2 = new FacebookPost();
        post2.setImeIprezimePost("Marko");
        post2.setImeiPrezimeObjava("Aleksandar");
        post2.setTekstObjave("Svi smo dobro, hvala na pitanju!");
        post2.deljenje();
        post2.deljenje();
        post2.deljenje();
        post2.deljenje();
        post2.deljenje();
        post2.likes();
        post2.likes();
        post2.likes();
        post2.dislake();


        post.stampaj();
        post2.stampaj();



    }










    }

