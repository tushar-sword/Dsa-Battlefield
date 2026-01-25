package BitManipulation.AdvanceMath.PowerN;

public class bruteForce {
    public static void  main(String args[]){
        int n=2;
        int p=5;
        int ans = 1;

        if(p>0){
        for(int i=1;i<=p;i++){
            ans = ans *n;
        }
    }
    else if(p==0){
        ans=1;
    }

    System.out.println(ans);
    }
}
