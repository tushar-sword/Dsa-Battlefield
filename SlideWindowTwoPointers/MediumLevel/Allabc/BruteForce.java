package SlideWindowTwoPointers.MediumLevel.Allabc;

public class BruteForce {
    public static void main(String []args) {
        String s = "abcbabc";

        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Array to track the count of 'a', 'b', and 'c'
            int[] freq = new int[3];

           
            for (int j = i; j < n; j++) {
                // Update frequency for current character
                freq[s.charAt(j) - 'a']++; // no. of a b c as they are 0 1 2 


                if (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                    // Add valid substring
                    count++;
                }
            }
        }

      System.out.println(count);
    }
}
