package Recursions.BasicRecurision;

public class factorial {
    public static int factoriali(int N){
        if(N==0){
            return 1;
        }
        return N * factoriali(N-1); //tail recursion
    }
    public static void main(String[] args) {
        int N=5;

       System.out.println(factoriali(N));
    }
}
