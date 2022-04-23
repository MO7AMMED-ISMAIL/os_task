
public class operation {

     synchronized public void sum(){
        int z = 0 ;
        for (int i = 0; i < 10; i++) 
           z+=i;
        System.out.println("Thread Summtion : value: "+z);
    }
   synchronized public void sub(){
        int x=100;
        for (int i = 0; i < 10; i++) 
             x-=i;
        System.out.println("Thread Substruction : value: "+x);
    }
   synchronized public void mul(){
        int x = 5;
        for (int i = 1; i < 10; i++) 
            x*=i ;
        System.out.println("Thread Multiplication : value: "+x);
    }
    
}
