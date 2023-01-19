package Domaci_16_01_2023;

public class Osoba1 {
    protected String imePrezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba1() {
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public Osoba1(String imePrezime, String jmbg, int godinaRodjenja) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj (){
        System.out.println(this.imePrezime + ", " + this.jmbg + " ," + this.godinaRodjenja);
    }
}
