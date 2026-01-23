package BitManipulation.Learn.NoOfSetBit;

public class BrianKernighanAlgorithm {

    public static int countSetBits(int n){
        int count =0;
       
         // Step 1: While n is non-zero, turn off the rightmost set bit
        while (n > 0) {
            n &= (n - 1);  // Turn off the rightmost set bit
            count++;  // Increment the count
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


// 10 = n = 1010
// 9 = 1001
// & them we get 1000
//one bit is off
// 8 = 1000
// 7 = 0111
// & them we get 0000
// 2nd bit is off answer is 2