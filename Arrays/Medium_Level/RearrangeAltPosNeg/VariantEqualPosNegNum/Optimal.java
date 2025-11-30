package Arrays.Medium_Level.RearrangeAltPosNeg.VariantEqualPosNegNum;

public class Optimal {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-1,-2,3};
        int[] ans = new int[arr.length];

        int posInd=0;
        int negInd=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[posInd]=arr[i];
                posInd +=2;
            }
            else{
                ans[negInd]=arr[i];
                negInd+=2;
            }
        }

        for(int i : ans){
            System.out.println(i);
        }
    }
}
