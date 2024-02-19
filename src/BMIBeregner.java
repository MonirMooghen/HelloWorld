import java.util.Scanner;


public class BMIBeregner {
    public static void main(String[] args) {

        double weightKG;
        double heightCM;

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast højde i centimeter (eks. 170): ");
        heightCM = input.nextDouble() / 100;

        System.out.println("Indtast vægt i kilogram (eks. 65): ");
        weightKG = input.nextDouble();

        double BMIberegner = (weightKG / (heightCM * heightCM));
        //System.out.println("Med en vægt på " + weightKG + "kilo, og en højde på " + heightCM + " centimeter er BMI'en på " + BMIberegner);

        if (BMIberegner <= 18.5) {
            System.out.println("Din BMI er " + BMIberegner + " Ifølge BMI er du undervægtig.");
        } else if (BMIberegner >= 18.5 && BMIberegner <= 25) {
            System.out.println("Din BMI er " + BMIberegner + " Ifølge BMI er du normalvægtig.");
        } else if (BMIberegner >= 25.1 && BMIberegner <= 30) {
            System.out.println("Din BMI er " + BMIberegner + " Ifølge BMI er du overvægtig.");
        } else {
            System.out.println("Din BMI er " + BMIberegner + ". Ifølge BMI er du meget overvægtig.");
        }

    }
}
