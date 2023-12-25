package U2A4;

public class App {

    public static void main(String[] args) {
        Hund h1 = new Hund(10,2,'m',"Rot");
        Katze k1 = new Katze(5,1,'m','h');
        // Tier t1 = new Tier(5,5,'m'); Geht nicht, weil die eine Abstrake Klasse ist

        System.out.println(h1.spricht());
        System.out.println(k1.spricht());
    }
}
