package BitManipulation.Interview.XORLtoR;

public class Optimal {
    // the XOR from 1 to n follows a pattern so 
    // to find XOR from L to R 
    // find 1 ----> R XOR
    // then find 1 ----> L-1 XOR
    // and then XOR the results of both 


    private static  int XORtillN(int n) {
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n + 1;
        if(n % 4 == 3) return 0;
        return n;
    }

     public static int findRangeXOR(int l, int r) {
        return XORtillN(l - 1) ^ XORtillN(r);
    }

    public static void main(String[] args) {
        int l = 3, r = 5;
        
        int ans = findRangeXOR(l, r);
        
        System.out.println("The XOR of numbers from " + l + " to " + r + " is: " + ans);
    }
}
