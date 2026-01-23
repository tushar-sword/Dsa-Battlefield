package BitManipulation.Learn.SetRightBit1;

public class solution {

    public static int setRightSideBit(int num){
    
    String binary = Integer.toBinaryString(num);

    //Convert string to char array (strings are immutable)
    char[] bits = binary.toCharArray();

    //Set the rightmost bit to '1'
    bits[bits.length - 1] = '1';

    //Convert back to string
    String updatedBinary = new String(bits);

    return Integer.parseInt(updatedBinary, 2);
    }
    public static void main(String args[]){
    int num = 10;  // Example input for n (binary: 11101)
        
        int result = setRightSideBit(num);

        System.out.println("The new number is " + result);
    }
}
