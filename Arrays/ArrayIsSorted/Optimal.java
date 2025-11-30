package Arrays.ArrayIsSorted;

public class Optimal {
    public static void main(String[] args) {
        
    
        int arr[]=  {1,2,3,4,5,6};

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                System.out.println(arr[i-1] +"<" +arr[i]+ "sorted");
            }
            else{
                System.out.println("unsorted");
            }
        }
    }
}
