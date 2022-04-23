
public class mulitplication extends Thread{
    
    operation op ;
      mulitplication(operation op){
         
         this.op = op;
     }
    @Override
    public void run(){
        op.mul();
    }
    
}
