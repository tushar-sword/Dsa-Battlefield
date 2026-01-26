package SlideWindowTwoPointers.FruitInBasket;

import java.util.HashMap;
import java.util.Map;

public class Better {
     public static void main(String args[]){
        int fru[]= { 1, 2, 3, 2, 2};
        int maxFruits=0;
        Map<Integer, Integer> basket = new HashMap<>();

        int L =0;
        int R =0;
        int n=fru.length;

        
        while(R<n){
            basket.put(fru[R], basket.getOrDefault(fru[R], 0) + 1);

            while(basket.size()>2){
                basket.put(fru[L], basket.get(fru[L]) - 1); // decrease the type of Fru was at L

                if (basket.get(fru[L]) == 0) { // agar freq 0 he ho jae toh hta he do , kuki max do he rakhne hai
                    basket.remove(fru[L]);
                }
                L++;
            }

                 maxFruits = Math.max(maxFruits, R - L + 1);
        }
        System.out.println(maxFruits);
    }
}

// TC = 2N
// SC = 2
