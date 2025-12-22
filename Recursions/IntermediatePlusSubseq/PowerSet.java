package Recursions.IntermediatePlusSubseq;

//String is immutable Here just an idea , also Leetcode has a different ArrayList 
//Question which is very confusing for me
public class PowerSet {
    public void Solution(String ip,String op){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }

        String op1=op;
        String op2=op;

        op2= op2+(ip.charAt(0));
        ip= ip.substring(1);

        Solution(ip,op1);
        Solution(ip,op2);
    }
}
