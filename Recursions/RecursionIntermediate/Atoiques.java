package Recursions.RecursionIntermediate;

import java.util.*;

class Solution {

     static final int INT_MIN_VAL = -2147483648;
    static final int INT_MAX_VAL = 2147483647;

    public int Solution(int sign , int num,String s,int i){

        // Base case: end or non-digit 
        if (i >= s.length() || !Character.isDigit(s.charAt(i))){
            return (int)(sign * num);
        }

        int digit = s.charAt(i) - '0';

           if (sign * num <= INT_MIN_VAL) return INT_MIN_VAL;
        if (sign * num >= INT_MAX_VAL) return INT_MAX_VAL;

        num = num * 10 + digit;


        // Recurse
        return Solution(sign, num, s, i+1);

    }
    public int myAtoi(String s) {
        int i = 0;

        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }

        int sign = 1;
        if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-') ){
            if(s.charAt(i)=='-'){
                sign = -1;
            }
            i++;
        }

       return Solution(sign,0,s,i);
    }
}

