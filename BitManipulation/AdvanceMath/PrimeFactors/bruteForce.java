package BitManipulation.AdvanceMath.PrimeFactors;


public class bruteForce {

    public static boolean checkPrime(int N){
        int count=0;
        // for(int i=2;i<sqrt(N);i++){
        //     if(N%i==0){
        //         count++;
        //         if(N/i != i){
        //                 count++;
        //         }
        //     }
        // }
        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int n = 36;

        for(int i=2;i<=n;i++){
            if(n%i==0){
                if(checkPrime(i)){
                    System.out.println(i);
                }
            }
        }
    }
}
