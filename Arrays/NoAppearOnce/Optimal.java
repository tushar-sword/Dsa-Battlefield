package Arrays.NoAppearOnce;

public class Optimal {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2,4};

        int xor =0;
        for(int i=0;i<arr.length;i++){
            xor ^= arr[i];
        }

        System.out.println("only once : "+xor);
    }
}
