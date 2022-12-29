package Domaci_27_12_2022;

public class Domaci2 {
    public static void main(String[] args) {

        SmartAirConditioning Samsung = new SmartAirConditioning();
        Samsung.name = "Samsung gx";
        Samsung.temperatura = 40;
        Samsung.mode = "cool";
        Samsung.temperaturaUnutra=25;
        Samsung.print();

        if (Samsung.razlika(Samsung.temperatura)) {
            System.out.println("Napolju je veca temperatura!");
        } else {
            System.out.println("Unutra je veca temperatura!");
        }
        System.out.println();


        SmartAirConditioning Midea = new SmartAirConditioning();
        Midea.name = "Midea 125X";
        Midea.temperatura = 40;
        Midea.mode = "heat";
        Midea.temperaturaUnutra=25;
        Midea.print();

        if (Midea.razlika(Midea.temperatura)) {
            System.out.println("Napolju je veca temperatura!");
        } else {
            System.out.println("Unutra je veca temperatura!");
        }



    }
}
