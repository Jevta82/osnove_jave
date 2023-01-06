package Projekat;

public class XOTabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeXIgraca;
    private String imeOIgraca;
    private String naPotezu;

    public void setImeXIgraca (String ime) {
        this.imeXIgraca = ime;
    }
    public void setImeOIgraca (String ime) {
        this.imeOIgraca = ime;
    }
    public String getImeXIgraca (){
        return this.imeXIgraca;
    }
    public String getImeOIgraca (){
        return this.imeOIgraca;
    }
    public String getNaPotezu () {
        return this.naPotezu;
    }
    public void pokreniIgra (){
        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";
        this.naPotezu = "X";
        System.out.println("Parametri su podeseni i igra moze da krene!");
    }
    public void stampaj () {
        System.out.println(this.polje1 + " | " + this.polje2 + " | " + this.polje3);
        System.out.println(this.polje4 + " | " + this.polje5 + " | " + this.polje6);
        System.out.println(this.polje7 + " | " + this.polje8 + " | " + this.polje9);

        System.out.println("Igrac X: " + this.imeXIgraca);
        System.out.println("Igrac O: " + this.imeOIgraca);

    }
    public boolean poljePrazno (int broj) {
        if (broj==1 && polje1.equals(" ")) {
            return true;
        } else if (broj==2 && polje2.equals(" ")) {
            return true;
        }else if (broj==3 && polje3.equals(" ")) {
            return true;
        }else if (broj==4 && polje4.equals(" ")) {
            return true;
        }else if (broj==5 && polje5.equals(" ")) {
            return true;
        }else if (broj==6 && polje6.equals(" ")) {
            return true;
        }else if (broj==7 && polje7.equals(" ")) {
            return true;
        }else if (broj==8 && polje8.equals(" ")) {
            return true;
        }else if (broj==9 && polje9.equals(" ")) {
            return true;
        } return false;
    }
    public void zameniIgraca (){
       if (this.naPotezu.equals("X")) {
           this.naPotezu="O";
       } else {
           this.naPotezu = "X";
       }
    }
    public boolean popunjenaTabla (){
        if (!this.polje1.equals(" ") && !this.polje2.equals(" ") && !this.polje3.equals(" ") &&
                !this.polje4.equals(" ") && !this.polje5.equals(" ") && !this.polje6.equals(" ") &&
                !this.polje7.equals(" ") && !this.polje8.equals(" ") && !this.polje9.equals(" ") ){
            return true;
        }
        return false;
    }
    public boolean pobednikX () {
        if (this.polje1.equals("X") && this.polje2.equals("X") && this.polje3.equals("X")){
            return true;
        } else if (this.polje4.equals("X") && this.polje5.equals("X") && this.polje6.equals("X")){
            return true;
        }else if (this.polje7.equals("X") && this.polje8.equals("X") && this.polje9.equals("X")){
            return true;
        }
        else if (this.polje1.equals("X") && this.polje4.equals("X") && this.polje7.equals("X")){
            return true;
        }
        else if (this.polje2.equals("X") && this.polje5.equals("X") && this.polje8.equals("X")){
            return true;
        }
        else if (this.polje3.equals("X") && this.polje6.equals("X") && this.polje9.equals("X")){
            return true;
        }
        else if (this.polje1.equals("X") && this.polje5.equals("X") && this.polje9.equals("X")){
            return true;
        }
        else if (this.polje3.equals("X") && this.polje5.equals("X") && this.polje7.equals("X")){
            return true;
        }
        return false;
    }
    public boolean pobednikO () {
        if (this.polje1.equals("O") && this.polje2.equals("O") && this.polje3.equals("O")){
            return true;
        } else if (this.polje4.equals("O") && this.polje5.equals("O") && this.polje6.equals("O")){
            return true;
        }else if (this.polje7.equals("O") && this.polje8.equals("O") && this.polje9.equals("O")){
            return true;
        }
        else if (this.polje1.equals("O") && this.polje4.equals("O") && this.polje7.equals("O")){
            return true;
        }
        else if (this.polje2.equals("O") && this.polje5.equals("O") && this.polje8.equals("O")){
            return true;
        }
        else if (this.polje3.equals("O") && this.polje6.equals("O") && this.polje9.equals("O")){
            return true;
        }
        else if (this.polje1.equals("O") && this.polje5.equals("O") && this.polje9.equals("O")){
            return true;
        }
        else if (this.polje3.equals("O") && this.polje5.equals("O") && this.polje7.equals("O")){
            return true;
        }
        return false;
    }
public void odigrajPotez (int broj){
        if (broj==1){
            this.polje1 = this.naPotezu;
        }
    if (broj==2){
        this.polje2 = this.naPotezu;
    }
    if (broj==3){
        this.polje3 = this.naPotezu;
    }
    if (broj==4){
        this.polje4 = this.naPotezu;
    }
    if (broj==5){
        this.polje5 = this.naPotezu;
    }
    if (broj==6){
        this.polje6 = this.naPotezu;
    }
    if (broj==7){
        this.polje7 = this.naPotezu;
    }
    if (broj==8){
        this.polje8 = this.naPotezu;
    }
    if (broj==9){
        this.polje9 = this.naPotezu;
    }
}
}

