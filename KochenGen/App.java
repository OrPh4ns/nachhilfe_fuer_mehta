package KochenGen;

public class App {

    public static void main(String[] args) {


        Reis r1 = new Reis();

        //Kochen k = new Kochen(r1);


        Tomaten t1 = new Tomaten();

        Kochen<Reis> k1 = new Kochen<Reis>();

        k1.WasKochen(r1);

        Kochen<Tomaten> k2 = new Kochen<Tomaten>();

        k2.WasKochen(t1);

    }

}
