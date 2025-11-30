package Recursions.BasicRecurision;

public class PrintNameNTimes {
    public static void printName(int n){ // 5 4 3 2 1 0
        if(n==0){                             //  -1 so stopped 
            return ;
        }
        System.err.println("Tushar"); //1 , 2 , 3 , 4 , 5 6
        printName(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printName(n);
    }
}
