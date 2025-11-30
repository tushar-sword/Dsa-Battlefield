package Arrays.SecondLargestElement;

public class MBetter {
    public static void main(String[] args) {
         int arr[]=  {7, 3, 7,4, -52, 2, 6, 5, 3, 5};

         int largest =arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int secLargest = Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
            if(arr[i] != largest && arr[i]>secLargest){
                secLargest=arr[i];
            }
        }

        System.out.println(secLargest);
    }
}
