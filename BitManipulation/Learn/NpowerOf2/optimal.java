package BitManipulation.Learn.NpowerOf2;

public class optimal {

    public static boolean NisPowerOf2(int num){
        if(num==1){
            return true;
        }
        return ((num) & (num-1)) == 0;
    }

    public static void main(String args[]){
        int num = 4;
        
        if(NisPowerOf2(num)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
