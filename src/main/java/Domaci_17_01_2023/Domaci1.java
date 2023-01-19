package Domaci_17_01_2023;

public class Domaci1 {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer(125, 125, 100, 240);
        TimeControl premotajUnapred = new TimeControl(true);
        TimeControl premotajUnazad = new TimeControl(false);
        AudioControl utisaj = new AudioControl(false);
        AudioControl pojacaj = new AudioControl(true);
        QualityOptimizerControl kvalitet = new QualityOptimizerControl(100);


        pojacaj.izvrsiakciju(videoPlayer);
        videoPlayer.stampaj();
        utisaj.izvrsiakciju(videoPlayer);
        videoPlayer.stampaj();
        pojacaj.izvrsiakciju(videoPlayer);
        pojacaj.izvrsiakciju(videoPlayer);
        videoPlayer.stampaj();
        premotajUnapred.izvrsiakciju(videoPlayer);
        videoPlayer.stampaj();
        kvalitet.izvrsiakciju(videoPlayer);
        videoPlayer.stampaj();


    }
}
