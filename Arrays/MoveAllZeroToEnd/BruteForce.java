package Arrays.MoveAllZeroToEnd;

public class BruteForce {
    public static void main(String[] args) {
        
        int arr[] = {1,2,0,0,3,4,3,0,0};

        int temp[] = new int[arr.length]; // can also use arrayList
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[a]=arr[i];
                a++;
            }
        }
        int noofZero= arr.length-temp.length;
        for(int i=0;i<noofZero;i++){  // First Copy back to arr then add zero save time by number of Zero
            temp[a]=0;
            a++;
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
            System.out.print(arr[i]+ " ");
        }
    }
}

//TC = N + X + (N - X) = 2N
