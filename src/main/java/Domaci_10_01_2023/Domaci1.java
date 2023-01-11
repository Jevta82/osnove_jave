package Domaci_10_01_2023;

public class Domaci1 {
    public static void main(String[] args) {

        Knjiga crniLeptiri = new Knjiga("124-254-36", "Crni Leptiri", 2023);

        Autor autor = new Autor("Gordana", "Breberina");
        crniLeptiri.setAutor(autor);
        crniLeptiri.stampaj();

        Autor autor1 = new Autor("Mario", "Puzo");

        Knjiga poslednjiDon = new Knjiga("354-545-655", "Poslednji Don", 2022);
        poslednjiDon.setAutor(autor1);
        poslednjiDon.stampaj();


    }
}
