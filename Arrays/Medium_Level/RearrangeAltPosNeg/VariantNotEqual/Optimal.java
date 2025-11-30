package Arrays.Medium_Level.RearrangeAltPosNeg.VariantNotEqual;

import java.util.ArrayList;
import java.util.Arrays;

public class Optimal {
    public static void main(String[] args) {
        int n=6;
         ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));

         ArrayList<Integer> pos=new ArrayList<>();
          ArrayList<Integer> neg=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0)
                pos.add(A.get(i));
            else
                neg.add(A.get(i));
        }

        if(pos.size()<neg.size()){
            for (int i = 0; i < pos.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

             int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                A.set(index, neg.get(i));
                index++;
            }
        }

             else {
            // First, fill array alternatively till the point 
            // where positives and negatives are equal in number.
            for (int i = 0; i < neg.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining positives at the end of the array.
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                A.set(index, pos.get(i));
                index++;
            }
        }
        

        for(int i : A){
            System.out.println(i);
        }
    }
}
