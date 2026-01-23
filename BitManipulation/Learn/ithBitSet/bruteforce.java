package BitManipulation.Learn.ithBitSet;

public class bruteforce {

    public static boolean checkIthBit(int num,int bitIndex){
        String binary = Integer.toBinaryString(num);

        // If the bit index is greater than the length of the binary string, the bit is 0
        if (bitIndex >= binary.length()) return false;

        return binary.charAt(binary.length() - 1 - bitIndex) == '1';


    }
    public static void main(String args[]){
        int num=5;
        int bitIndex=0;

        if(checkIthBit(num, bitIndex)){
            } else {
            System.out.println("The " + bitIndex + "-th bit of " + num + " is not set (0).");
        }
    }
}


// Time Complexity: O(log n), due to integer-to-binary conversion and indexing.

// Space Complexity: O(log n), for the binary string.