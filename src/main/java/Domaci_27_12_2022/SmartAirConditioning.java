package Domaci_27_12_2022;

public class SmartAirConditioning {
    public String name;
    public int temperatura;
    public String mode;
    public int temperaturaUnutra;

    public void print () {
        System.out.println("Marka klime je - " + this.name);
        System.out.println("Temperatura napolju je - " + this.temperatura + " C");
        System.out.println("Klima je podesena da - " + this.mode);
    }

    public boolean razlika (int temperatura) {
        if (this.temperatura>this.temperaturaUnutra) {
            return true;

        } return false;
    }
}
