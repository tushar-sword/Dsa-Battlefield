package Arrays.RemoveDuplicates;
import java.util.*;
public class BruteForce {
    public static void main(String[] args) {
            int arr[]=  {7, 3, 7,4, -52, 2, 6, 5, 3, 5};
            System.out.println("Array Length Before" + arr.length);
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<arr.length;i++){
                set.add(arr[i]);
            }
            int j=0;
            for(int x : set){
                arr[j++]=x;
            }

            System.out.println("Array Length After" +j);
    }
}
