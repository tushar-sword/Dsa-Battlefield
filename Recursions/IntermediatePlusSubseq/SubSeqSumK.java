package Recursions.IntermediatePlusSubseq;

public class SubSeqSumK {

    static int count = 0;

    public static void Solution(int[] input, int n, int idx, int sum) {

        if (idx == input.length) {
            if (sum == n) {
                count++;
            }
            return;
        }

        // Take the element
        Solution(input, n, idx + 1, sum + input[idx]);

        // Not take the element
        Solution(input, n, idx + 1, sum);
    }

    public static void main(String[] args) {
        int input[] = {1, 2, 3};
        int n = 3;

        Solution(input, n, 0, 0);
        System.out.println(count);
    }
}
