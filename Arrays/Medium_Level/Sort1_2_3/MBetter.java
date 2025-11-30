package Arrays.Medium_Level.Sort1_2_3;

public class MBetter {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 2, 0, 1};
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }

            else{
                count2++;
            }

        }

        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<count1+count0;i++){
            arr[i]=1;
        }
        for(int i=count1+count0;i<count2+count1+count0;i++){
            arr[i]=2;
        }


        for(int a:arr){
            System.out.println(a);
        }
    }
}

//TC = 2N
//SC = 1