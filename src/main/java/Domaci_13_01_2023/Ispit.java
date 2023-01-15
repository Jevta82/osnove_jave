package Domaci_13_01_2023;

public class Ispit {
    private String nazivIspita;
    private int ocena;
    private String imePrezimeProfesora;

    public String getNazivIspita() {
        return nazivIspita;
    }

    public void setNazivIspita(String nazivIspita) {
        this.nazivIspita = nazivIspita;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }

    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public Ispit(String nazivIspita, int ocena, String imePrezimeProfesora) {
        this.nazivIspita = nazivIspita;
        this.ocena = ocena;
        this.imePrezimeProfesora = imePrezimeProfesora;
    }
    public boolean polozenIspit (){
        if (this.getOcena()==5) {
            return false;
        } return true;
    }
    public void stampaj (){
        System.out.println(this.nazivIspita + " - " + this.imePrezimeProfesora + " - " + this.ocena);
    }
}
