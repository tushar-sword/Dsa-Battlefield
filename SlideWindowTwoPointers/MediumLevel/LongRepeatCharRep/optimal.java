package SlideWindowTwoPointers.MediumLevel.LongRepeatCharRep;

public class optimal {
    public static void main(String args[]){
        String s = "BAAAABBBAAA";
        int k = 2;
        int maxlen=0;
        int n = s.length();

        int L=0;
        int R=0;
        int maxFreq = 0;

        // Array to count frequency of characters in window
        int[] freq = new int[26];

        while( R<n ){

            //R pe jo hai uski freq badha di
            freq[s.charAt(R)-'A']++;

            //Ab check kro kya eski max hai
            maxFreq = Math.max(maxFreq, freq[s.charAt(R)-'A']);

            //ab replace nikalo jitne bhi hue maxFreq usse
            int replace = (R-L+1) - maxFreq;

            if (replace > k) {
                // shrink window (ONLY L moves)
                freq[s.charAt(L) - 'A']--;
                L++;
            } else {
                // valid window
                maxlen = Math.max(maxlen, R - L + 1);
                R++; // move R only when window is valid
            }

        }

          
        

        System.out.println(maxlen);
    }
}
