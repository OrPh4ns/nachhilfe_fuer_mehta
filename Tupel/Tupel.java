package Tupel;

public class Tupel <T extends Tier>{

    private T x;
    private T y;


    public void zeigeX(){
        System.out.println(this.x);
    }
    public void zeigeY(){

        System.out.println(this.y);
    }
}
