package Vererbung3UndSchnittstelle;

public class App {

    public static void main(String[] args) {

        Hund h1 = new Hund("schwarz",5);

        //Tier t1 = new Tier();

        // Das braucht man nie Tier t1 = new Tier();


        //Tier t = new Tier();
        Schwein s1 = new Schwein("Weiss",3);

        Vogel v1 = new Vogel("Rot",5);

        Vogel v2 = new Vogel("Schwarz",6);

        h1.WasBinIch();

        s1.WasBinIch();

        v2.WelcheFarbe();
        v1.WelcheFarbe();

        s1.WelcheFarbe();

        v1.wasKannIchbesonders();




    }


}
