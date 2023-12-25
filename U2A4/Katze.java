package U2A4;

public class Katze extends Tier{

    private char helligkeit; // extra Attribu


    // ganz ganz ganz wichtig
    public Katze(int gr, int alter, char geschlecht, char helligkeit) {
        super(gr, alter, geschlecht);
        this.helligkeit = helligkeit;
    }

    @Override
    public String spricht() {
        return "Miau Miau";
    }
}
