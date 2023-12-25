package Stall;


public class App {

    Hund h1 = new Hund();
    Katze k1 = new Katze();


    Stall<Tier> stal1 = new Stall<Tier>(h1);
    Stall<Tier> stall2 = new Stall<Tier>(k1);
    Stall<Auto> a = new Stall<Auto>(new Auto());

    Stall_wildcard<Tier> stall3 = new Stall_wildcard<Tier>(h1);
   // Stall_wildcard<Auto> stall4 = new Stall_wildcard<Auto>(k1); falsch, weil wir Wildcard verwndet haben und bestimmt
    // welchen Datentypd der Stall annimmt

}
