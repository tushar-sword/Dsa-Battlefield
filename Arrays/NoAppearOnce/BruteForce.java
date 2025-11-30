package Arrays.NoAppearOnce;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2,4};

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i]; // selected element
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) System.out.println("only once :" + i);;
        }
    }
}
