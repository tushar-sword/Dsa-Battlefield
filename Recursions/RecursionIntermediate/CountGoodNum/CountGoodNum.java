package Recursions.RecursionIntermediate.CountGoodNum;

// The only issue in the solution is that it work for n when its small when its big it exceed the time limit
class Solution {

     static final int MOD = 1_000_000_007;

    public int Solution(long n , int i,int ans){
        if(i>=n){
            return ans;
        }

        if(i % 2 == 0 ){
             ans = (ans * 5) % MOD;
        }
        else{
            ans = (ans * 4) % MOD;
        }

       return Solution(n,i+1,ans);
        
    }
    public int countGoodNumbers(long n) {
        int i = 0;
        int ans = 1;
       int answer = Solution(n,i,ans);
       return answer;
    }
}
