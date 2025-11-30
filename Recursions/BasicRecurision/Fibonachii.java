package Recursions.BasicRecurision;

public class Fibonachii {
     static int fibonacci(int N){
    // Base Condition.
            if(N <= 1){
               
                return N;
                
            }
            
            System.out.println((N-1) +" "+ (N-2));
            return fibonacci(N-1) + fibonacci(N-2);
            
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of N to be 4.
       int N = 4;
       System.out.println(fibonacci(N));
    }
}
