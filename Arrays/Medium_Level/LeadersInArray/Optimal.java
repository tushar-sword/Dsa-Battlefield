package Arrays.Medium_Level.LeadersInArray;

public class Optimal {
    public static void main(String[] args) {
        int arr []= {4, 7, 1, 0};

        int max = arr[arr.length-1];
        System.out.println(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.println(max);
            }
        }
    }
}

// can return in an array 
// TC = N
// SC = 1