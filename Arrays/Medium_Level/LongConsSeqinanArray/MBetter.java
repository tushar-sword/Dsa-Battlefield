package Arrays.Medium_Level.LongConsSeqinanArray;
import java.util.*;
public class MBetter {
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};

        Arrays.sort(a);
        
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        //find longest sequence:
        for (int i = 0; i < a.length; i++) {
            if (a[i] - 1 == lastSmaller) {
                //a[i] is the next element of the
                //current sequence.
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        System.out.println(longest);
    }
}


//TC = O(NlogN) + O(N)

// SC = 1