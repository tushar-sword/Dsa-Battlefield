package Arrays.SecondLargestElement;

public class Optimal {
    public static void main(String[] args) {
        int arr[]=  {7, 3, 7,4, -52, 2, 6, 5, 3, 5};

        int largest = arr[0], secLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest ){
                secLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secLargest  && arr[i]<largest){
                secLargest=arr[i];
            }
        }

        System.out.println(secLargest);
    }
}
