package BitManipulation.Learn.Swap2Num;

public class Optimal {
    public static void main(String args[]){
        int a = 10;
        int b = 5;


        //using x ^ x = 0
        //      x ^ 0 = x
        
        a=a^b;
        b=a^b;
        a=a^b;


        System.out.println(a+"=a,b="+b);
    }
}
