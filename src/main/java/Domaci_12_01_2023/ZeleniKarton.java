package Domaci_12_01_2023;

public class ZeleniKarton {
    //ime i prezime studenta
    //broj indeksa
    //naziv predmeta
    //ime i prezime profesora
    //ocenu - od 5 do 10
    //gettere i settere
    //konstruktore
    //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
    //metodu stampaj koja stampa podatke u formatu:
    //		(naziv predmeta) - (ocena)
    //		Student: ime i prezime, broj indeksa
    //		Profesor: ime i prezime
    private String imePrezime;
    private String brojIndexa;
    private String nazivPredmeta;
    private String imePrezimeProfesora;
    private int ocena;

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }

    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public ZeleniKarton(String imePrezime, String brojIndexa, String nazivPredmeta, String imePrezimeProfesora, int ocena) {
        this.imePrezime = imePrezime;
        this.brojIndexa = brojIndexa;
        this.nazivPredmeta = nazivPredmeta;
        this.imePrezimeProfesora = imePrezimeProfesora;
        this.ocena = ocena;
    }

    public boolean polozio (){
        if (ocena!=5) {
            return true;
        } return false;
    }
    public void stampaj (){
        System.out.println(this.nazivPredmeta + " - Ocena " + this.ocena);
        System.out.println("Student : " + this.imePrezime + ", " + this.brojIndexa);
        System.out.println("Profesor : " + this.imePrezimeProfesora);
    }

}
