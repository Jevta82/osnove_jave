package p13_12_2022;

public class Zadatak6 {
    public static void main(String[] args) {

//Napisati program koji racuna povrsinu kvadrata stranice a,
// i povrsinu kruga poluprecnika r. PI = 3.14.
// Povrsina kruga je r (na kvadrat) * pi
//Primer izvrsenja:
//a: 5
//Povrsina kvadrata je 25
//r: 3
//Povrsina kruga je 28.26

        double a= 5;
        double r= 3;
        double pi = 3.14;
        double kvadratura = a * a;
        double povrsina= (r*r) * 3.14;

        System.out.println("Povrsina kvadrata je: " + kvadratura);
        System.out.println("Povrsina kruga je: " + povrsina);
    }
}
