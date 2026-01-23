package BitManipulation.Learn.NisOdd;

public class optimal {
    public static boolean checkLastBit(int num){
        String binary = Integer.toBinaryString(num);
        
        //checking the last bit
        return binary.charAt(binary.length() - 1 ) == '1';


    }
    public static void main(String args[]){
        int num=5;

        if(checkLastBit(num)){
            System.out.println("The" + num + "is odd");
            } else {
            System.out.println("The" + num + "is even");
        }
    }
}


// Time Complexity: O(1), constant time bitwise operation.

// Space Complexity: O(1), no additional space used.