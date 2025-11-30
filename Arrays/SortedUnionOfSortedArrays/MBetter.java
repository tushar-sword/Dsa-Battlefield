package Arrays.SortedUnionOfSortedArrays;

import java.util.ArrayList;
import java.util.HashSet;

public class MBetter {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,};
        int arr2[] = {2,3,4,6};


        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>(); 

        for(int i=0;i<arr1.length;i++){  //n
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){  //m
            set.add(arr2[i]);
        }

        for(int val : set){             //n+m(unique)
            list.add(val);
        }

        for(int val : list){
            System.out.println(val);     // n + m(unique)
        }
    }
}


// This can be done without arraylist too but we need to save the answer atlast in a array

// Time Complexity:
// O(n + m) — because all insertions and traversals are linear and you're using a HashSet.

// Space Complexity:
// O(n + m) → for the HashSet and the ArrayList (in worst case, all elements are unique). // used only to return the answer



