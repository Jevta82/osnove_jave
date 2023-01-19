package Domaci_17_01_2023;

public class TimeControl extends Control {


    private boolean naKojustranu;
    public boolean isNaKojustranu() {
        return naKojustranu;
    }

    public void setNaKojustranu(boolean naKojustranu) {
        this.naKojustranu = naKojustranu;
    }
    @Override

    public double izvrsiakciju(VideoPlayer videoPlayer) {
        if (naKojustranu){
            if (videoPlayer.getKvalitetVidea()+10> videoPlayer.getDuzinaVidea()) {
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getDuzinaVidea());} else {
           videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea()+10);

           }
        } else {
            if (videoPlayer.getDuzinaVidea()<0){
                videoPlayer.setTrenutnoVremeVidea(0);
            } else {
            videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea()-10);}

        } return videoPlayer.getTrenutnoVremeVidea();
        }

    public TimeControl(boolean naKojustranu) {
        this.naKojustranu = naKojustranu;
    }

}
