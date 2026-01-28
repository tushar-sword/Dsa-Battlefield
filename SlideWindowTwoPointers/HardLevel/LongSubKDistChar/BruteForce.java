package SlideWindowTwoPointers.HardLevel.LongSubKDistChar;

import java.util.HashMap;
import java.util.Map;

public class BruteForce {
    public static void main(String args[]){

        String s = "aababbcaacc" ;
         int k = 2;
         int n=s.length();
          int maxLength = 0;

         for(int i=0;i<n;i++){

            Map<Character, Integer> freq = new HashMap<>();

            for(int j=i;j<n;j++){

                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);

                if(freq.size()>k){
                    break;
                }

                 maxLength = Math.max(maxLength, j - i + 1);

            }
         }

         System.out.println(maxLength);
    }
}
