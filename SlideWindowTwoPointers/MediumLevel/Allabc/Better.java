package SlideWindowTwoPointers.MediumLevel.Allabc;

public class optimal {
    // A special question i must say in which we use the min in hashmap to find substrings 


    public static void main(String []args) {
        String s = "abcbabc";

        int count = 0;
        int n = s.length();
        int L=0;
        int R=0;
       
        int[] freq = new int[3];

        while(R<n){
            freq[s.charAt(R)-'a']++;

            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){

                 // Count substrings from current right to end
                count += (s.length() - R);

                freq[s.charAt(L)-'a']--;
                L--;
            }
        }


      System.out.println(count);
    }
}
