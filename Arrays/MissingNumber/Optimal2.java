package Arrays.MissingNumber;

public class Optimal2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int N=5;

        int xor1=0,xor2=0;
        for(int i=0;i<arr.length;i++){
            xor1 ^= arr[i];
            xor2 ^= i+1;
        }

        xor2 ^= N;

        int missing = xor1^xor2;
        System.out.println("missing no." +missing);
    }
}
