package Domaci_16_01_2023;

public class Trener extends Osoba{
    private int godineIskustva;
    private String tipTrenera;

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    public Trener(String imePrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }
    public void stampaj (){
        System.out.println("Trener");
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tipTrenera);
    }
}
