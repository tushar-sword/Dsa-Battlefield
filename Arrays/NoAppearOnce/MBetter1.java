package Arrays.NoAppearOnce;

public class MBetter1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2,4};

        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }


        int hash[] = new int[maxi+1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (hash[arr[i]] == 1)
                System.out.println("only once:" + arr[i]);
        }


    }
}


