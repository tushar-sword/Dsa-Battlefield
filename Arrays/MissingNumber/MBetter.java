package Arrays.MissingNumber;
public class MBetter {
    public static void main(String[] args) {
        
    
    int arr[] = {1,2,3,5};
    int N=5;

    int hash[] = new int[N+1]; //N+1 is used because index will start from 0 and we need Index till N so N+1 make 0 1  2 3 4 5 N

    for(int i=0;i<arr.length;i++){
        hash[arr[i]]++;
    }

    for(int j=1;j<hash.length;j++){
        if(hash[j] ==0 ){
            System.out.println("missing number is :" + j);
        }
    }
    }

}
