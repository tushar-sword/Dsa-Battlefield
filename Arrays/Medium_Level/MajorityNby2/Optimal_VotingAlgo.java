package Arrays.Medium_Level.MajorityNby2;

public class Optimal_VotingAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1,1,1,2, 2, 2,3,3,3,3,3,3,3,3,3,3,3,3};
        int el =0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count == 0){
                el =arr[i];
                count ++;
            }
            else if(el == arr[i]){
                count ++;
            }
            else{
                count --;
            }
        }

        System.out.println(el + "is major");
    }
}

//only if majority is assured in question

//TC = N    
//SC = 1
