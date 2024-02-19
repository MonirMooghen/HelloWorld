public class Tid {
    public static void main(String[] args) {
        int sekunderStart = 00;
        int timerStart = 11;
        int minutterStart = 13;
        int sekunderSidenMidnat = (timerStart * 60 * 60) + (minutterStart * 60) + (sekunderStart);
        int sekunderTilbageAfDagen =(86400-sekunderSidenMidnat);
        int sekunderNu = 20;
        int timerNu = 11;
        int minutterNu = 35;
        int timerBrugt = (timerNu-timerStart);
        int minutterBrugt = (minutterNu-minutterStart);
        int sekunderBrugt = (sekunderNu-sekunderStart);



        System.out.println("Timer: " + timerStart);
        System.out.println("Minutter: " + minutterStart);
        System.out.println("Sekunder: " + sekunderStart);

        //Siden midnat er der gået...//
        System.out.println("Siden midnat er der gået " + sekunderSidenMidnat +" sekunder" );

        //Sekunder tilbage af dagen//
        System.out.println("Sekunder tilbage af dagen: " + sekunderTilbageAfDagen + " sekunder");


        System.out.println("Siden jeg begyndte opgaven har jeg brugt " + (timerNu - timerStart) + " timer, " + (minutterNu - minutterStart) + " minutter og " + (sekunderNu - sekunderStart) + "sekunder");
        //havde glemt at sætte plus til næstsidst)
        //eller//
        System.out.println("Siden jeg begyndte opgaven har jeg brugt " + timerBrugt + " timer, " + minutterBrugt + " minutter og " + sekunderBrugt + " sekunder");
    }
}
