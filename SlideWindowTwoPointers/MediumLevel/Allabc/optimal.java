package SlideWindowTwoPointers.MediumLevel.Allabc;

import java.util.*;

public class optimal {

    public static void main(String []args) {
        String s = "abcbabc";

        int count = 0;
        int n = s.length();

        int[] lastSeen = new int[3];
        Arrays.fill(lastSeen,-1);

        for(int i=0;i<n;i++){

            lastSeen[s.charAt(i) - 'a'] = i;

            while(lastSeen[0] != 1 && lastSeen[1] != 1 && lastSeen[2] != 1 ){

                count += Math.min( lastSeen[0],  Math.min(lastSeen[1], lastSeen[2])) + 1;
            }
        }

        System.out.println(count);
    }
}
