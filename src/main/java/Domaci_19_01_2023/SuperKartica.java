package Domaci_19_01_2023;

public class SuperKartica {
    private String brojKartice;
    private String imePrezime;
    private int popust;

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public SuperKartica(String brojKartice, String imePrezime, int popust) {
        this.brojKartice = brojKartice;
        this.imePrezime = imePrezime;
        this.popust = popust;
    }

    public SuperKartica() {
    }
    public void stampaj (){
        System.out.println("Broj Kartice: " + this.brojKartice);
        System.out.println("Ime i prezime: " + this.imePrezime);
    }
}
