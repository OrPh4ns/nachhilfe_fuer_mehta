package Thread2;

public class Test {


    public static void main(String[] args) throws InterruptedException {
        Sara sara = new Sara();
        Jessica jessica = new Jessica();


        sara.start();
        sara.join(); // jessica wartet bis Sara fertig ist
        jessica.start();

    }
}
