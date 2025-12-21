package Recursions.RecursionIntermediate.CountGoodNum;


// Logic : 5^evenCount×4^oddCount mod(109+7)
class Solution {

    static final long MOD = 1_000_000_007;

    private long power(long x, long n) {
        if (n == 0) return 1;

        long half = power(x, n / 2);
        long result = (half * half) % MOD;

        if (n % 2 == 1)
            result = (result * x) % MOD;

        return result;
    }

    public int countGoodNumbers(long n) {

        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long ans = (power(5, evenCount) * power(4, oddCount)) % MOD;

        return (int) ans;
    }
}

