package Recursions.IntermediatePlusSubseq;

public class IFsubseqSUMK {

    public static boolean Solution(int[] input, int n, int idx, int sum) {

        if (idx == input.length) {
            return sum == n; // kisi bhi point pe ye sach hua toh chal jaega true vrna false toh hai he 
        }

        // Take the element
        if (Solution(input, n, idx + 1, sum + input[idx])) {
            return true; //❗ Yeh line khud TRUE nahi banati
                         //❗ Yeh sirf TRUE ko forward karti hai
        }

        // Not take the element
        if (Solution(input, n, idx + 1, sum)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int input[] = {1, 2, 3};
        int n = 3;

        boolean ans = Solution(input, n, 0, 0);
        System.out.println(ans);
    }
}
