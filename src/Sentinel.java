import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int SENTINEL= -1;
    int tal= 0;
    int sum = 0;

    System.out.println("Indtast de tal, som skal lægges sammen, eller -1 for at stoppe programmet og få summen");
    while (tal != SENTINEL) {
        sum += tal;
        tal = scanner.nextInt();
        }
    System.out.println("Summen er " + sum);
    }
}
