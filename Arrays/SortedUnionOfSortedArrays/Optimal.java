package Arrays.SortedUnionOfSortedArrays;

import java.util.ArrayList;

public class Optimal {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {2, 3, 4, 6};

        ArrayList<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            } else {
                // both are equal
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Handle remaining elements of arr1
        while (i < n) {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }

        // Handle remaining elements of arr2
        while (j < m) {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }

        // Output the result
        for (int val : Union) {
            System.out.print(val + " ");
        }
    }
}


//Total Time: O(n + m)

// Space: O(n + m) (only if counting space for the result)