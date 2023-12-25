package Thrad1;

public class MitInterface implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ;i < 20;i++){
            System.out.println(i);
        }
    }
}
