package Arrays.Medium_Level.Sort1_2_3;

public class Optimal_DNF_Algoritm {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 2, 0, 1};
        int low = 0;
        int mid =0;
        int high=arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;

                mid++;
                low++;
            }
            else if(arr[mid]==2){
                int temp = arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;

                high--;
            }
            else{
                mid++;
            }
        }

        for(int i:arr){
            System.out.println(i);
        }
    }
}

// TC = N
// SC = 1