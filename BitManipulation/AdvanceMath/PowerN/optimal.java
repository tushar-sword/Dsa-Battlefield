package BitManipulation.AdvanceMath.PowerN;

public class optimal {


     private static double power(double x, long n) {
        
        if (n == 0) return 1.0;
        if (n == 1) return x;
        
        // If 'n' is even
        if (n % 2 == 0) {
            return power(x * x, n / 2);
        }
        
        // If 'n' is odd 
        return x * power(x, n - 1);
    }

     public static double myPow(double x, int n) {
        // If 'n' is negative
        if (n < 0) {
            
            return 1.0 / power(x, -n);
        }
        
        // If 'n' is non-negative
        return power(x, n);
    }

    public static void main(String[] args) {
        
        double x = 2.0;
        int n = 10;

        
        double result = myPow(x, n);

        
        System.out.println(x + "^" + n + " = " + result);
    }
}
