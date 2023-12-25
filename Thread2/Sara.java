package Thread2;

public class Sara extends Thread{

    @Override
    public void run() {
        for(int i = 0 ;i < 20;i++){
            System.out.println("Sara : "+i);

        }
    }

}
