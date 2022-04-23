
public class addition implements Runnable{

    @Override
    public void run(){
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x += i;
        }
        System.out.println("thread Addition Value: "+x);
    }
}
