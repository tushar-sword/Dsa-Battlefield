package Arrays.SortedUnionOfSortedArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class BruteForce {

    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> Union=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++){
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }

        for(int it : map.keySet()){
            Union.add(it);
        }
        
        return Union;



    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,};
        int arr2[] = {2,3,4,6};
        int n = 4 , m = 4;

        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("union is :");
        Collections.sort(Union);
        for(int val : Union){
            System.out.print(val+" ");
        }
        



    }
}





// | Line / Loop    | Description                             | Time Complexity | Reason                                                    |
// | -------------- | --------------------------------------- | --------------- | --------------------------------------------------------- |
// | **Loop 1**     | `for (int i = 0; i < arr1.length; i++)` | O(n)            | Each `put()` and `getOrDefault()` is O(1) in average case |
// | **Loop 2**     | `for (int i = 0; i < arr2.length; i++)` | O(m)            | Same as above                                             |
// | **Loop 3**     | `for (int it : map.keySet())`           | O(n + m)        | In worst case, map will have up to n + m keys             |
// | **Sorting**    | `Collections.sort(Union)`               | O(k log k)      | Where k = number of unique elements (<= n + m)            |
// | **Print loop** | `for (int val : Union)`                 | O(k)            | Just printing each value once                             |


// Time complexity - O(n + m + (n + m) log(n + m)) = O((n + m) log(n + m)) = ➤ O(n + m + k log k)

// ❗️ Space Complexity:
// HashMap stores up to n + m unique keys → O(n + m)

// Union ArrayList stores up to n + m elements → O(n + m)

// 🔁 So, Space Complexity: O(n + m)

