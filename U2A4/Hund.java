package U2A4;

public class Hund extends Tier{


    private String farbe; // das ist eine extera Attribut

    public Hund(int gr, int alter, char geschlecht, String farbe) {
        super(gr, alter, geschlecht);
        this.farbe = farbe;
    }

    @Override
    public String spricht() {
        return "Wau wau";
    }
}
