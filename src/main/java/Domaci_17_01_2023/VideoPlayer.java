package Domaci_17_01_2023;

public class VideoPlayer {

    private int duzinaVidea;
    private int trenutnoVremeVidea;
    private int trenutnaJacina;
    private int kvalitetVidea;

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public int getTrenutnaJacina() {
        return trenutnaJacina;
    }

    public void setTrenutnaJacina(int trenutnaJacina) {
        this.trenutnaJacina = trenutnaJacina;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int trenutnaJacina, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.trenutnaJacina = trenutnaJacina;
        this.kvalitetVidea = kvalitetVidea;
    }
    public void stampaj (){
        System.out.println("Trenutno vreme videa: " + this.getTrenutnoVremeVidea());
        System.out.println("Jacina zvuka je: " + this.getTrenutnaJacina());
        System.out.println("Kvalitet videa je: " + this.getKvalitetVidea());
    }
}

