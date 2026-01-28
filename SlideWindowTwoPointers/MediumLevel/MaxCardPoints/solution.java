package SlideWindowTwoPointers.MediumLevel.MaxCardPoints;

public class solution {
    public static void main(String[] args){
        

        int cardScore[] = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int Lsum=0;
        int Rsum=0;
        int maxsum=0;
        for(int i=0;i<k-1;i++){
            Lsum = Lsum + cardScore[i];
        }
        maxsum=Lsum;

        int rightsidep = cardScore.length-1;
        for(int i=k-1;i>=0;i--){
            Lsum= Lsum-cardScore[i];

            Rsum= Rsum+cardScore[rightsidep];
            rightsidep--;

            maxsum= Math.max(maxsum, Lsum + Rsum );

        }
    
        System.out.println(maxsum);
    }
}
