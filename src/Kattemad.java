import java.util.Scanner;

public class Kattemad {
public static void main(String[] args) {

double pishiWeight = 3100;
double katWeight = 4200;
String kattensNavn ;


Scanner input = new Scanner(System.in);
System.out.println("Hvilken kat skal du give mad til?");
kattensNavn = input.nextLine();

double procentOfWeight ;

if (kattensNavn.equalsIgnoreCase("Kat")) {
    procentOfWeight = 0.03; // 3% for Kat
} else if (kattensNavn.equalsIgnoreCase("Pishi")) {
    procentOfWeight = 0.04; // 4% for Pishi
} else {
    System.out.println("Ukendt kat. Kan ikke bestemme mængde mad.");
    return; // Stopper programmet, da kat ikke er kendt
}

double maengdeMad = kattensNavn.equalsIgnoreCase("Kat") ? (katWeight * procentOfWeight/3) : (pishiWeight * procentOfWeight/3);

System.out.println(kattensNavn + " skal have " + (procentOfWeight*100) + "% af sin kropsvægt, og skal derfor have " + maengdeMad + " gram mad for et måltid hvis hun får tre måltider om dagenk.");
    }
}
