package Domaci_17_01_2023;

public class AudioControl extends Control{
private boolean pojacajZvuk;

    public boolean isPojacajZvuk() {
        return pojacajZvuk;
    }

    public void setPojacajZvuk(boolean pojacajZvuk) {
        this.pojacajZvuk = pojacajZvuk;
    }

    public AudioControl(boolean pojacajZvuk) {
        this.pojacajZvuk = pojacajZvuk;
    }



    @Override
    public double izvrsiakciju(VideoPlayer videoPlayer) {
        if (isPojacajZvuk()){
            if (videoPlayer.getTrenutnaJacina()+1>=100){
                videoPlayer.setTrenutnaJacina(100);
            } else {
            videoPlayer.setTrenutnaJacina(videoPlayer.getTrenutnaJacina() +1);}

        } else {
            if(videoPlayer.getTrenutnaJacina()<0){
                videoPlayer.setTrenutnaJacina(0);
            } else{
            videoPlayer.setTrenutnaJacina(videoPlayer.getTrenutnaJacina() -1);}


        } return videoPlayer.getTrenutnaJacina();
    }
}
