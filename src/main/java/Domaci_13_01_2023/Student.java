package Domaci_13_01_2023;

import java.util.ArrayList;

public class Student {

    private int brojIndeksa;
    private String imePRezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student(int brojIndeksa, String imePRezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imePRezime = imePRezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }


    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImePRezime() {
        return imePRezime;
    }

    public void setImePRezime(String imePRezime) {
        this.imePRezime = imePRezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);
    }

    public double prosek() {
        double counter = 0;
        double suma = 0;
        double prosek;
        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).polozenIspit()) {
                suma = suma + ispiti.get(i).getOcena();
                counter++;
            }

        }
        return prosek = suma / counter;

    }

    public void stampaj() {
        System.out.println(this.brojIndeksa + " - " + this.imePRezime + " - " + this.tipStudija);
        System.out.println("Predmeti:");
        for (int i = 0; i < ispiti.size(); i++) {

            System.out.println(this.ispiti.get(i).getNazivIspita() + " - " + this.ispiti.get(i).getImePrezimeProfesora() + " - " + ispiti.get(i).getOcena());

        }
        System.out.println("Prosecna ocena studenta " + this.imePRezime + " je: " + this.prosek());

    }
}
