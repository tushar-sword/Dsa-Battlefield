package Arrays.MissingNumber;

public class BruteForce {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int N=5;

        for(int i=1;i<N;i++){

            int flag =0;

            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    flag++;
                }
            }
            if(flag ==0 ){
                System.out.println("missing number is :" + i);
            }
        }
    }
}

// TC = N^2
//SC = 1