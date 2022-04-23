

public class summtion extends Thread{

    operation op;
    public summtion(operation op) {
        this.op = op;   
    }
     
     @Override
     public void run(){
       op.sum();
     }
}
