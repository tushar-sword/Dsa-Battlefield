package Recursions.IntermediatePlusSubseq;

import java.util.*;
public class AllBinarySubstring {
   

    public static void Solution(int n,String curr , List<String> result){
        if(curr.length()==n){
            result.add(curr);
            return ;
        }

        Solution(n, curr+"0", result);

        if(curr.isEmpty() || curr.charAt(curr.length()-1) != '1'){
            Solution(n, curr+"1", result);
        }
    }

     public static void main(String [] args){
        int n =4;
        ArrayList <String> result= new ArrayList<>();
        Solution(n," ",result);
    }
}
