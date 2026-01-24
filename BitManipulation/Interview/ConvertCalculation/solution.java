package BitManipulation.Interview.ConvertCalculation;

public class solution {

    public static int convertcount(int num,int target){
        
        // it has the setbit and we have to count them
       int result = num ^ target;
        int count =0;

        // at int is 32 bit so till 32 only
       for (int i = 0 ; i<32 ;i++){
        count = count + (result & 1);

        num = num >> 1;
       }
       return count ;
    }
    public static void main(String[] args) {
        int num = 10;
        int target = 7;  
        
        int result = convertcount(num,target);

        System.out.println("The number of set bits is: " + result);
    }
}
