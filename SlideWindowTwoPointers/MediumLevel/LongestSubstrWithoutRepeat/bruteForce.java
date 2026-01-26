package SlideWindowTwoPointers.MediumLevel.LongestSubstrWithoutRepeat;

import java.util.Arrays;

public class bruteForce {
    public static void main(String args[]){
        String s = "abcdedabac";

        int n = s.length();
        int maxlen = 0;

        for(int i=0;i<n;i++){
            int []hash = new int[256];
            Arrays.fill(hash,0);

            for(int j=i;j<n;j++){
                if(hash[s.charAt(j)] == 1){
                    break;
                }
  
                hash[s.charAt(j)] = 1;

                int len = j - i + 1;
                maxlen = Math.max(maxlen, len);
            }
        }  

        System.out.println(maxlen);
      }
}

// TC = N^2
// SC = 256

