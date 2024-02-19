import java.util.Scanner;

public class Portoberegner {
    public static void main(String[] args) {
        // | = option + i
        double brevIGram;
        int pris = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Hvad vejer dit brev i gram?");
        brevIGram = input.nextDouble();

        if (brevIGram <= 0 || brevIGram > 500) {
            System.out.println("Et brev med denne vægt kan vi ikke sende.");
        } else if (brevIGram <= 100) {
            pris = 25;
        } else if (brevIGram > 100 && brevIGram <= 250) {
            pris = 50;
        } else if (brevIGram > 250 && brevIGram <= 500) {
            pris = 75;
        }
        if (brevIGram > 0 && brevIGram <= 500) {
            System.out.println("Et brev, som vejer " + brevIGram + " gram vil koste " + pris + " kroner at sende.");
        }
    }
}