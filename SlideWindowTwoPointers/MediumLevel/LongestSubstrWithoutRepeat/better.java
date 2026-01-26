package SlideWindowTwoPointers.MediumLevel.LongestSubstrWithoutRepeat;

import java.util.Arrays;
// Difficult one being honest
public class better {
    
     public static void main(String args[]){
        String s = "abcdedabac";

        int n = s.length();
        int maxlen = 0;

       int []hash = new int[256];

       Arrays.fill(hash, -1);

       int l =0;
       int r=0;

       while(r<n){
        if(hash[s.charAt(r)] != -1){ // char is in the map if in the map 

            if(hash[s.charAt(r)] >= l){   // jo bhi update kr rhe ho after l hona cahea not before c wale condition hai yha pe // ab agge bulane mei ho skta hai aap kisi peche ke charc ko mapp se bhar na nikalo aur skip krdo bad mei jab vo aae u see ki nahi string ki defining mei nahi hai par ha bhai ye toh mpp hai , eseliye jo bhi ho usko L se bda hona cahea usko move krvane ke liye pechle pe vo move nahi karega 
                l = hash[s.charAt(r)]+1; // move krdo L ko uski new position+ 1 pe  cabcda a dhubara mila toh next jha tha usse ek agge 1 aaega / look up 
            }
        }

        int len = r - l + 1;

        maxlen = Math.max(len, maxlen);
        hash[s.charAt(r)] = r ;
        r++;
       }



     }
}
