package Thrad1;

public class Test {

    public static void main(String[] args) {

        // Mit Klasse Thread
        MitErben mitErben1 = new MitErben();

        mitErben1.start();

        // Mit Interface

        MitInterface mitInterface1 = new MitInterface();

        Thread t1 = new Thread();

        //t1.start(mitInterface1);
    }
}
