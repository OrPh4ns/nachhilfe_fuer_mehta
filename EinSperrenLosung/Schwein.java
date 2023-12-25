package EinSperrenLosung;

import Vererbung3UndSchnittstelle.Tier;

public class Schwein extends Tier {


    public Schwein(String farbe, int alter) {
        super(farbe, alter);
    }

    @Override
    public void was() {
        System.out.println("");
    }


}
