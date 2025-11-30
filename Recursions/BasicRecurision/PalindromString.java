package Recursions.BasicRecurision;

public class PalindromString {
    public static boolean isPalindrom(String str,int start,int end){
        if(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }else{
                return isPalindrom(str, start + 1, end - 1);
            }
        }
      return true;
    }

    // static boolean palindrome(int i, String s){
            // Base Condition
    //         if(i>=s.length()/2) return true;
    //         if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
    //         return palindrome(i+1,s);
    // }

    public static void main(String[] args) {
        String str = "madadadam";
        int n = str.length();
        if(isPalindrom(str,0,n-1)){
            System.out.println("The string is Palindrom");
        }else{
            System.out.println("The string is not Palindrom");
        }
    }
}
