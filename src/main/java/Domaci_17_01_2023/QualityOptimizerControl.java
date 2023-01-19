package Domaci_17_01_2023;

public class QualityOptimizerControl extends Control{
    private double brzina;

    public double getBrzina() {
        return brzina;
    }

    public void setBrzina(double brzina) {
        this.brzina = brzina;
    }

    public QualityOptimizerControl(double brzina) {
        this.brzina = brzina;
    }

    @Override
    public double izvrsiakciju(VideoPlayer videoPlayer) {
        if (this.getBrzina()*10.1<=144) {
            videoPlayer.setKvalitetVidea(144);
        } else if (this.getBrzina()*10.1<=240 ){
            videoPlayer.setKvalitetVidea(240);
        }else if (this.getBrzina()*10.1<=360 ){
            videoPlayer.setKvalitetVidea(360);
        }else if (this.getBrzina()*10.1<=480 ){
            videoPlayer.setKvalitetVidea(480);
        }else if (this.getBrzina()*10.1<=720 ){
            videoPlayer.setKvalitetVidea(720);
        }else {
            videoPlayer.setKvalitetVidea(1080);
        } return videoPlayer.getKvalitetVidea();

    }

}
