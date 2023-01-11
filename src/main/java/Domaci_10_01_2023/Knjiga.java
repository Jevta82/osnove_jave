package Domaci_10_01_2023;

public class Knjiga {
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
        private String ISBN;
        private String naziv;
        private int godinaIzdavanja;
        private Autor autor;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdavanja() {
        return godinaIzdavanja;
    }

    public void setGodinaIzdavanja(int godinaIzdavanja) {
        this.godinaIzdavanja = godinaIzdavanja;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Knjiga(String ISBN, String naziv, int godinaIzdavanja) {
        this.ISBN = ISBN;
        this.naziv = naziv;
        this.godinaIzdavanja = godinaIzdavanja;
    }
    public void stampaj (){
        System.out.println("ISBN " + this.ISBN);

        System.out.println("Naziv " + this.naziv + " - " + this.godinaIzdavanja + ".god");
        System.out.println("Autor: " + this.autor.getIme() + " " + this.autor.getPrezime());
    }
}
