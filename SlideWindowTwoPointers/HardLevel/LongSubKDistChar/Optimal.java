package SlideWindowTwoPointers.HardLevel.LongSubKDistChar;

import java.util.HashMap;
import java.util.Map;

public class Optimal {
    
    public static void main(String args[]){

        String s = "aababbcaacc" ;
         int k = 2;
         int n=s.length();
          int maxLength = 0;
          int R=0;
          int L=0;
          Map<Character, Integer> freq = new HashMap<>();

          while(R<n){

            freq.put(s.charAt(R), freq.getOrDefault(s.charAt(R), 0) + 1);

            while(freq.size()>k){

                char leftChar = s.charAt(L);
                freq.put(leftChar, freq.get(leftChar) - 1);

                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                 L++;
            }
             maxLength = Math.max(maxLength, R - L + 1);
           
          }

         System.out.println(maxLength);
    }
}

// Also enhance it a little by removing the While loop 
