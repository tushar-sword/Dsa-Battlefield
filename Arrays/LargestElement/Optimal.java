package Arrays.LargestElement;

public class Optimal {
    public static void main(String[] args) {
        int arr[]=  {7, 3, 4, -52, 2, 6, 5, 3, 5};

        int largest =arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
