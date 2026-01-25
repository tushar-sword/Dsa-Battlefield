package BitManipulation.AdvanceMath.AllDivisor;

public class optimized {
     public static void main(String args[]){
        int n=36;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i+"is a divisor");
            }
            if(n%i != i){
                System.out.println(n%i + "is a divisor");
            }
        }
    }
}

//you can make a list of these too
// TC = sqrt N
