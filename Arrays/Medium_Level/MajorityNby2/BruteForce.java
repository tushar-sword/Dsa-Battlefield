package Arrays.Medium_Level.MajorityNby2;

public class BruteForce {
    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1,1,1,2, 2, 2,3,3,3,3,3,3,3,3,3,3,3,3};
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > (arr.length/2)){
                System.out.println(arr[i] + " is major ");
                break;
            }else if(i==arr.length-1){
                System.out.println("no major");
            }
        }
    }
}

//TC = N^2
//SC = 1