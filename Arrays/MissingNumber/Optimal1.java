package Arrays.MissingNumber;

public class Optimal1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int n=5;
        int Osum= (n*(n+1))/2;
        int Fsum=0;

        for(int i=0;i<arr.length;i++){
            Fsum += arr[i];
        }

        System.out.println("Missing element is :" + (Osum-Fsum));
    }
}
