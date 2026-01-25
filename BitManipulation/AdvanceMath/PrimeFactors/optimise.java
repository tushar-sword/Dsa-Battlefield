package BitManipulation.AdvanceMath.PrimeFactors;

public class optimise {
    public static void main(String args[]){
        int N =36;

        for(int i=2;i<Math.sqrt(N);i++){
            if(N%2==0){
                // list.add(i);

                while(N%i==0){
                    N=N/i;
                }
            }
        }

        if(N != 1){
            // list.add(N);
        }
    }
}

// TC = sqrt N x logn
