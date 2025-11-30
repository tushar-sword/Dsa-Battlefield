package Arrays.LinearSearch;


public class LinearSeach {
    public static void main(String[] args) {
        int arr[] = {1,2,0,0,3,4,3,0,0};
        int target = 4;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                 target = target - arr[i];
                break;
            }
        }

        if(target == 0){
        System.out.println("target hit");
        }
        else{
            System.out.println("Miss");
        }
    }
}
