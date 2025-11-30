package Recursions.BasicRecurision;

public class Print1toN {
    public static void print1toN(int N){
        if(N==0){
            return ;
        }
        print1toN(N-1);
        System.out.println(N);
    }
    public static void main(String[] args) {
        int N=10;
        print1toN(N);
    }
}
