package BitManipulation.Learn.ithBitSet;

public class optimal {

 public static boolean checkIthBit(int num,int bitIndex){
    
       // Check if the i-th bit is set using bitwise AND operation
        return (num & (1 << bitIndex)) != 0;  // If the i-th bit is 1, the result will be non-zero


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


// Time Complexity: O(1), constant time bitwise operation.

// Space Complexity: O(1), no additional space used.