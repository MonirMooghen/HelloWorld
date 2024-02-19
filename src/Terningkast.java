import java.util.Random;

public class Terningkast {
    public static void main(String[] args) {
    Random rand = new Random();
    int sum = 0;


    while (sum !=7) {
        int terning1 = rand.nextInt(1,7);
        int terning2 = rand.nextInt(1,7);
        sum = terning1 + terning2;


        //System.out.println("Du har slået " + terning1 + " og " + terning2 + ". Summen = " + sum);
    }
    }
}
