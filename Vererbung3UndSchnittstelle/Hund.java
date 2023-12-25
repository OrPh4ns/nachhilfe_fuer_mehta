package Vererbung3UndSchnittstelle;

public class Hund extends Tier {

    public Hund(String farbe, int alter) {
        super(farbe, alter);
    }

    @Override
    public void was() {
        System.out.println("was macht ein Hund");
    }

}
