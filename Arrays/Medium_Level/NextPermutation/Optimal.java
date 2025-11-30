package Arrays.Medium_Level.NextPermutation;
import java.util.*;
public class Optimal {

     
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        int n = A.size(); // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(A);
            return A;
        }

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int tmp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }

        // Step 3: reverse the right half:
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }

    public static void main(String args[]) {
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }

}

// Example 1 
//  2 3 1 = 3<1 no  
//          2<3 yes idx = 0

//          find greater than 2 from last = 3 
//          swap = 3 2 1 

//          reverse idx = 0 ke bad wala part 
//          final = 3 1 2

// Example 2 
//  1 3 2 =  3<2 no 
            //  1<3 yes idx = 0 

            //  find greater than 1 from last = 2 
            //  swap = 2 3 1 

            //  reverse after idx =9 
            //  final = 2 1 3


            // TC = N + N + N = 3N
            // SC = 1