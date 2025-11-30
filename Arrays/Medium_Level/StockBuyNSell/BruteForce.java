package Arrays.Medium_Level.StockBuyNSell;

public class BruteForce {
    public static void main(String[] args) {
       int prices[] = {7,1,5,3,6,4};
        int profit =-1;
        int maxi=Integer.MIN_VALUE;
       for(int i=0;i<prices.length;i++){
        for(int j=i+1;j<prices.length;j++){
             if(prices[j]>prices[i]){
            profit = prices[j]-prices[i];
             }
             maxi =Math.max(maxi,profit);
        }
       }

       System.out.println("max profit is"+maxi);
    }
}


// TC = N^2
// SC = 1