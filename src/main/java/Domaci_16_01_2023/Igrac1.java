package Domaci_16_01_2023;

import java.util.ArrayList;

public class Igrac1 extends Osoba1{
    private int brojIgraca;
    private String pozicijaIgraca;
    ArrayList<Karton>karton;
    private boolean kapiten;

    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public String getPozicijaIgraca() {
        return pozicijaIgraca;
    }

    public void setPozicijaIgraca(String pozicijaIgraca) {
        this.pozicijaIgraca = pozicijaIgraca;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public Igrac1() {
    }

    public Igrac1(String imePrezime, String jmbg, int godinaRodjenja, int brojIgraca, String pozicijaIgraca, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicijaIgraca = pozicijaIgraca;
        this.kapiten = kapiten;
        this.karton = new ArrayList<>();
    }
    public void dodajKarton (Karton karton){
        this.karton.add(karton);
    }
    public int brojZutih () {
        int count = 0;
        for (int i = 0; i < this.karton.size(); i++) {
            if (karton.get(i).getTipKartona().equals("zuti") ){
                count++;
            }

        } return count;
    }
    public int brojCrvenih () {
        int countZuti = 0;
        for (int i = 0; i < this.karton.size(); i++) {

            if (karton.get(i).getTipKartona().equals("crveni")) {
                countZuti++;
            }

        }   return countZuti;

    }

    public void stampaj (){
        System.out.println("Igrac: ");
        super.stampaj();
        System.out.println("Broj igraca je: " + this.brojIgraca);
        System.out.println("Njegova pozicija je: " + this.pozicijaIgraca);
        if (isKapiten()){
            System.out.println("Kapiten je u svom timu!");
        } else {
            System.out.println("Nije kapiten u svom timu!");
        }
        System.out.println("Kartoni koje je dobio su: ");
        for (int i = 0; i <karton.size(); i++) {
            System.out.println(karton.get(i).getTipKartona());
        }
        System.out.println("Broj zutih kartona je : " + this.brojZutih() );
        System.out.println("Broj crvenih kartona je: " + this.brojCrvenih());


    }

}
