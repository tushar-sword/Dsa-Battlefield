package Arrays.Medium_Level.StockBuyNSell;

public class Optimal {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        int min = prices[0];
        int profit =0;
        int maxi = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            profit = prices[i]-min;
            maxi =Math.max(maxi,profit);
            
        }

        System.out.println(maxi);
    }
}


// TC = N
// SC = 1