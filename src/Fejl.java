import java.util.Random;
public class Fejl {
public static void main(String[] args) {
    Random rand = new Random();
    int sum = 0;
    // int terning1;
    // int terning2;
    //sum = terning1 + terning2; //fejlen

    while (sum !=7) {
        int terning1 = rand.nextInt(1,7);
        int terning2 = rand.nextInt(1,7);
        sum = terning1 + terning2;

        System.out.println("Du har slået " + terning1 + " og " + terning2 + ". Summen = " + sum);
    }

    /*int tal=4;
    if (tal ==3); //semikolonet her gør, at den ignorerer hvad end, som kommer før den. 
    {
        System.out.println("Hej");
                                         */
    }
}
