public class DemoIntegerDivision {
    public static void main(String[] args) {
        //double enTredjedel = (double)1/3;
        //System.out.println(enTredjedel);

        /*Hvis man bruger integer kan den ikke læse det, og 1/3 vil rundes ned til 0.
        Derfor skal man enten lave én af numrene til double eks. 1.0/3 ELLER tvinge
        den til at blive double ved "(double)1/3" eller "1d/3"*/

        int tal = 4;
        double nytTal = tal;
        System.out.println(nytTal);

        double tal2 = 4.5;
        int nytTal2 = (int) tal2;
        System.out.println(nytTal2);
    }
}
