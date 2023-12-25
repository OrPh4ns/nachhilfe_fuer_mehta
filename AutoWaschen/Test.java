package AutoWaschen;

public class Test {
    public static void main(String[] args) {

        Auto a1 = new Auto();
        Saft s1 = new Saft();
        BMW bmw = new BMW();

        AutoWaschen<Auto> aw1 = new AutoWaschen<Auto>(bmw);
       // AutoWaschen<Saft> aw2 = new AutoWaschen<Saft>(s1);
    }
}
