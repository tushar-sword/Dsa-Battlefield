package Arrays.MoveAllZeroToEnd;

public class Optimal {

    public static void main(String[] args) {
        int arr[] = {1,2,0,0,3,4,3,0,0};
        int j =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                 j=i;
                break;
            }
        }

        for(int i=j+1;i<arr.length;i++){
            if(arr[i] != 0){
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}

//TC =  X + (N - X) = N
