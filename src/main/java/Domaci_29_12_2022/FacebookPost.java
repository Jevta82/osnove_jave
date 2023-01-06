package Domaci_29_12_2022;

public class FacebookPost {
    private String imeiPrezimeObjava;
    private String imeIprezimePost;
    private String tekstObjave;
    private int brojLajkova;
    private int brojDeljenja;

    public void setImeiPrezimeObjava(String ime) {
        this.imeiPrezimeObjava = ime;
    }

    public void setImeIprezimePost(String ime) {
        this.imeIprezimePost = ime;
    }

    public void setTekstObjave(String objava) {
        this.tekstObjave = objava;
    }

    public String getImeiPrezimeObjava() {
        return this.imeiPrezimeObjava;
    }

    public String getImeIprezimePost() {
        return this.imeIprezimePost;
    }

    public String getTekstObjave() {
        return this.tekstObjave;
    }

    public int getBrojLajkova() {
        return this.brojLajkova;
    }

    public int getBrojDeljenja() {
        return this.brojDeljenja;
    }

    public int likes() {
        this.brojLajkova = this.brojLajkova  + 1;
        return this.brojLajkova;
        }
        public int dislake () {
        this.brojLajkova = this.brojLajkova -1;
        if (this.brojLajkova<0) {
            this.brojLajkova = 0;
        } return this.brojLajkova;
        }

    public void stampaj() {
        System.out.println(this.imeIprezimePost + ">>>>>" + this.imeiPrezimeObjava);
        System.out.println(this.tekstObjave);
        System.out.println("Likes " + this.brojLajkova + "||" + "Shares " + this.brojDeljenja);
    }

    public int deljenje() {
            return this.brojDeljenja = this.brojDeljenja + 1;

    }
}







