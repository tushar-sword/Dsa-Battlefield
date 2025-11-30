package Recursions.BasicRecurision;

public class SumN {
    public static int Sumans(int N, int sum) {
        if (N == 0) {
            return sum; 
        }

        sum += N;
        return Sumans(N - 1, sum); 
    }

    public static void main(String[] args) {
        int N = 10;
        int sum = 0;
        int ans = Sumans(N, sum);
        System.out.println(ans); 
    }
}
