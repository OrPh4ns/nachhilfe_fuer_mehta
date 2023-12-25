package Vererbung3UndSchnittstelle;

public class Vogel extends Tier implements Extra_eigenschaften, Zweite_extra_eigenschaft {

    public Vogel(String farbe, int alter) {
        super(farbe, alter);
    }

    @Override
    public void was() {
        System.out.println("was macht ein Vogel");
    }


    @Override
    public void wasKannIchbesonders()
    {
        System.out.println("Ja ich kann was besonders und zwar fliegen");
    }
}
