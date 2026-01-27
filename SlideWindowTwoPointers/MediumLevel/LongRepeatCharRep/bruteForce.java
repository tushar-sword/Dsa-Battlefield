package SlideWindowTwoPointers.MediumLevel.LongRepeatCharRep;


public class bruteForce {
    public static void main(String args[]){
        String s = "BAABAABBBAAA";
        int k = 2;
        int maxlen=0;
        int n = s.length();

        for(int i=0;i<n;i++){

            int[] freq = new int[26];

            int maxFreq=0;
            for(int j=i;j<n;j++){
                
                //increase freq of current element
                freq[s.charAt(j) - 'A']++;

               // find the max element frequencyy
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

                 int windowSize = j - i + 1;

                 int replacements = windowSize - maxFreq;

                 if (replacements <= k) {
                    maxlen = Math.max(maxlen, windowSize);
                 }
            }
        }
        System.out.println(maxlen);
        
        }
    }


    // TC = n^2
    // SC = 1

