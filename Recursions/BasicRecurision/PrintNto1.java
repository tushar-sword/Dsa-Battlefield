package Recursions.BasicRecurision;

public class PrintNto1 {
     public static void print1toN(int N){
        if(N==0){
            return ;
        }
        System.out.println(N);
        print1toN(N-1);
        
    }
    public static void main(String[] args) {
        int N=10;
        print1toN(N);
    }
}
