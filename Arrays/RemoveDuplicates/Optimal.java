package Arrays.RemoveDuplicates;

public class Optimal {
    public static void main(String[] args) {
        int arr [] = {2,2,3,3,3,4,4,5,6,6};
        int a=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                System.out.println(arr[i-1]+"!="+arr[i]);
                arr[a]=arr[i-1];
                a++; // array is not minimizing just updating
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
