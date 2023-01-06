package Domaci_29_12_2022;

public class SmartAirConditioning {

    public String markaKlime;
    public double potrosnjaHladi;
    public double potrosnjaGreje;
    public int trenutnaTemperatura;
    public String mod;

    public double mesecnaPotrosnja () {
        double poSatu = 1;

        if (mod.equals("hladi")) {
            poSatu = 30 * 15 * potrosnjaHladi;
        }
        if (mod.equals("greje")) {
            poSatu = 30 * 15 * potrosnjaGreje;
        } return poSatu;
    }

        public double mesecnaCena (){
            double cena = 1;
            double drugaZona = 0;
            if (this.mesecnaPotrosnja()>350) {
            drugaZona = this.mesecnaPotrosnja()-350;
            cena = 350*6 + drugaZona*9;

            }return cena;
        }
        public void stampaj () {
            System.out.println(this.markaKlime + " - Mod " + this.mod + " - Trenutna temperatura" + this.trenutnaTemperatura + "C");
        }




    }



