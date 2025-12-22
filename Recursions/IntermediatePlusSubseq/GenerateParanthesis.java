package Recursions.IntermediatePlusSubseq;

import java.util.*;
public class GenerateParanthesis {

    public static void Solution(String op , int close , int open , List<String> resultVector){
        if(open == 0 && close == 0){
            resultVector.add(op);
            return;
        }

         if (open > 0) {
        Solution(op + "(", close, open - 1, resultVector);
    }

    if (close > open) {
        Solution(op + ")", close - 1, open, resultVector);
    }
    }
    public static void main(String [] args){
        List<String> resultVector = new ArrayList<String> ();
        int close = 3;
        int open = 3;
        String op = "";
        Solution(op,close,open,resultVector);
    }
}
