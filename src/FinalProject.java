
import finalproject.Account;
import finalproject.Student;
import finalproject.Teccher;


public class FinalProject {
    //task1
static int Avege(int []arr){
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int avrage = sum / arr.length;
        return avrage;
    }//end taskone
    //task2
     static int fact(int n)
    {
        if (n <= 1)
            return 1;
        else{
        return n * fact(n - 1);}
    }
 
    static int nPr(int n, int r)
    {
        return fact(n) / fact(n - r);
    }//end task2
    public static void main(String[] args) {
         int[] arr = {12 , 10 , 20 , 40} ;
         int x = Avege(arr);
         System.out.println("the average is : "+x);
         //end task 1 
         
         System.out.println("-------------------------------------------");
         
         System.out.println(nPr(5,2)); 
         //end task 2
         System.out.println("-------------------------------------------");
         
         Account A1 = new Account(1, "Mohammed", 1000);
         Account A2 = new Account(2, "ali", 1000);
         int mybalance =A1.cridet(1000);
         int withdraw =A1.debit(1000);
         int tranfer = A1.tranfer(A2, 500);
         System.out.println("the blance account is  = "+mybalance); 
         System.out.println("After withdraw an account the blance is = "+withdraw); 
         System.out.println("After withdraw an account the blance is = "+tranfer);
         A1.getBlance();
         A2.getBlance();
         //end task 3
         System.out.println("----------------------------------------------");
         
         String[] course ={"ai","os2","sw","logic"};
             int[] grade = {100,100,100}; 
             Student s1=new Student("Mohamed", "Tanta",course ,grade);
             
             Teccher T1 = new Teccher("ahmed", "Egypt");
             boolean check =T1.addCourse(course[2]);
             
             
             if(check == false){
                 System.out.println("the course is aredy exsited");
             } else{
                 System.out.println("the course is added");
             }
             
             
             boolean check2 =T1.removeCourse(course[3]);
             
             if(check2 == true){
                 System.out.println("the course is remove");
             } else{
                 System.out.println("the course is not exsited");
             }
             
             s1.averageGrade(grade);
             //end task 4 
             System.out.println("----------------------------------------------");
             
             // first way
                operation op = new operation();
                summtion sum = new summtion(op);
                subtraction sub = new subtraction(op);
                mulitplication mul = new mulitplication(op);
                sum.start();
                sub.start();
                mul.start();
            //second way   
                addition add =new addition();
                substract sub2 =new substract();
                Thread t = new Thread(add);
                Thread t2 = new Thread(sub2);
                t.start();
                t2.start();
                //end task 5
             System.out.println("----------------------------------------------");
    }
    
}
