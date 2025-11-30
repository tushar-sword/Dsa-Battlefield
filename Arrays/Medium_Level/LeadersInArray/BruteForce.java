package Arrays.Medium_Level.LeadersInArray;

public class BruteForce {
    public static void main(String[] args) {
        int arr []= {10, 22, 12, 3, 0, 6};
        int flag ;
        for(int i=0;i<arr.length;i++){
             flag =  0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    flag=1;
                }
            }
            if(flag==0){
                    System.out.println(arr[i]);
                }
        }
    }
}
