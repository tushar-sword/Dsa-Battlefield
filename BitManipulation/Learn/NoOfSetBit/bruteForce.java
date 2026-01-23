package BitManipulation.Learn.NoOfSetBit;

public class bruteForce {

    public static int countSetBits(int n){
        int count =0;
        while (n > 0) {
             count += (n & 1);  // Check if the least significant bit is set (1)
             n >>= 1;
        }

         // Step 2: Return the count of set bits
        return count;
    }
    public static void main(String[] args) {
        int num = 29;  // Example input for n (binary: 11101)
        
        int result = countSetBits(num);

        System.out.println("The number of set bits is: " + result);
    }
}
