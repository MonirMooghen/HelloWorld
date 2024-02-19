public class ArraysOpgaver {
public static void main(String[] args) {

int[] myArray = new int[8];
myArray[0] = 34;
myArray[myArray.length-1] = 117; //kan også skrives som 7, men så er det hard coded

for (int i = 0; i < myArray.length; i++) { //med i++ tæller den i og så +i
    System.out.print(myArray[i] + " ");
}
    System.out.println();
String[] myArray2 = {"hej", "med", "dig"};
for (String item: myArray2) { //for each loop

System.out.print(item + " "); //added + " " for at få mellemrum mellem Strings
}

System.out.println();

double[] myArray3 = { 3.4, 2.5, 1.2, 6.7};
System.out.println(myArray3[2]);
System.out.println(myArray3.length);
//System.out.println(myArray3[4]); //4 eksisterer ikke, kun 0, 1, 2 og 3
}
}