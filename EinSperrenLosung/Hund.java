package EinSperrenLosung;

import Vererbung3UndSchnittstelle.Tier;

public class Hund extends Tier {

    public Hund(String farbe, int alter) {
        super(farbe, alter);
    }

    @Override //weil diese Methode in der Klasse Tier abstarct war!!
    public void was() {
        System.out.println("was macht ein Hund");
    }

}
