import java.util.Scanner;

public class Tidsberegner {

    public static void main(String[] args) {
    int sekunder ;
    int timer ;
    int minutter ;
    Scanner input = new Scanner(System.in);

    System.out.println("Hvor mange hele timer er der gået siden midnat?");
    timer = input.nextInt();
    //System.out.println("Der er gået " + timer + " timer");

    System.out.println("Hvor mange hele minutter er der gået?");
    minutter = input.nextInt();

    System.out.println("Hvor mange hele sekunder er der gået?");
    sekunder = input.nextInt();

    //System.out.println("Der er gået " + timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder siden midnat");
    System.out.println("Der er gået " + ((timer * 60 * 60) + (minutter * 60) + sekunder) + " sekunder siden midnat");
    }
}
