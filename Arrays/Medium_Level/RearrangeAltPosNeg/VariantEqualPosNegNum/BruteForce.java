package Arrays.Medium_Level.RearrangeAltPosNeg.VariantEqualPosNegNum;

import java.util.ArrayList;

public class BruteForce {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-1,-2,3};

          ArrayList<Integer> pos=new ArrayList<>();
          ArrayList<Integer> neg=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }

        for(int i=0;i<arr.length/2;i++){
      
      arr[2*i] = pos.get(i);
      arr[2*i+1] = neg.get(i);
  }
        


        for(int i: arr){
            System.out.println(i);
        }


    }
}


// TC = O(N+N/2)
// SC = O(N/2 + N/2) = O(N)