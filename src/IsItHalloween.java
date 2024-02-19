import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {

        String month;
        int date;

        Scanner input = new Scanner(System.in);
        System.out.println("Hvad måned er det? (Skriv måned)");
        month = input.nextLine();

        System.out.println("Hvad dato er det?");
        date = input.nextInt();

        if (month.equalsIgnoreCase("oktober") && date == 31) {
            System.out.println("Det er Halloween i dag! Hav en uuuuhyggelig dag");
        } else {
            System.out.println("Det er ikke Halloween i dag. Det er den " + date + ". " + month);
        }
    }
}