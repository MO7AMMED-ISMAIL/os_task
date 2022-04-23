
package finalproject;


public class Account {
 
   private int id,blance;
   private  String name;
    
    public Account(int id , String name){
       
        this.name = name;
        this.id = id;       
    }
    public Account(int id , String name,int blance){
       
        this.name = name;
        this.id = id;
        this.blance=blance;
    }
    
    public int cridet(int amount ){
        
        this.blance +=amount;
        return blance;
    }
    public int debit(int amount ){
        
        if(blance >= amount){
            blance -=amount;
            System.out.print("the operation are executed and blance is ");
            
        }else{
            System.out.print("Your blance is not engouh for cridet amount,blance ");
        }   
        return blance;
    }
     public int tranfer(Account a2 , int amount){
         
         if(blance >= amount){
             blance -= amount;
             a2.cridet(amount);
              return blance;
         }else{
             System.out.println("blance is not egoth");
             return blance;
         }   
     }
     public void getBlance(){
             System.out.println("blance"+this.blance);
         } 
 }
    

