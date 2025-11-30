package Arrays.LargestElement;

import java.util.*;

class BruteForce {
    public static void main(String[] args) {
        int arr[] = {7, 3, 4, 52, 2, 6, 5, 3, 5};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
