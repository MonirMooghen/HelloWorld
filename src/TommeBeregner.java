import java.util.Scanner;

public class TommeBeregner {
    public static void main(String[] args) {
    double tommer;
    //double tommerTilCm = (tommer * 2.54);

    Scanner input = new Scanner(System.in);

    System.out.println("Indtast en længde i tommer: ");
    tommer = input.nextDouble();
    final double CENTIMETER_PER_TOMME = 2.54;

    System.out.println(tommer + " tommer svarer til " + (tommer * CENTIMETER_PER_TOMME) + " centimeter");
    }
}
