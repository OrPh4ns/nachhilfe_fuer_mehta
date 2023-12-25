package EinSperrenLosung;

public class App {


    public static void main(String[] args) {
        Zwinger2<Schwein> z2 = new Zwinger2<Schwein>();
        Zwinger2<Hund> z3 = new Zwinger2<Hund>();
        Zwinger2<Vogel> z4 = new Zwinger2<Vogel>();
        Zwinger2<Katze> z5 = new Zwinger2<Katze>();


        Hund h = new Hund("Black", 3);
        Schwein s2 = new Schwein("Weiss,",5);
        Vogel v1 = new Vogel();
        Katze k1 = new Katze();


        z4.sperreEin(v1);

        z3.sperreEin(h);
        z2.sperreEin(s2);
        z5.sperreEin(k1);
    }
}
