package Domaci_16_01_2023;

public class Igrac extends Osoba{
    private int brojIgraca;
    private String pozicija;
    private boolean kapiten;

    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public Igrac() {
    }

    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int brojIgraca, String pozicija, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }
    @Override
    public void stampaj (){
        System.out.println("Igrac: ");
        super.stampaj();
        System.out.println("Broj igraca je " + this.brojIgraca);
        System.out.println("Pozicija na kojoj igra je: " + this.pozicija);
        if (this.isKapiten()){
            System.out.println("Igrac je kapiten u timu");
        }
        else {
            System.out.println("Igrac nije kapiten u timu");

        }
    }
}
