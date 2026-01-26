package SlideWindowTwoPointers.MediumLevel.FruitInBasket;

import java.util.HashMap;
import java.util.Map;

public class optimal {
     public static void main(String args[]){
        int fru[]= { 1, 2, 3, 2, 2};
        int maxFruits=0;
        Map<Integer, Integer> basket = new HashMap<>();

        int L =0;
        int R =0;
        int n=fru.length;

        
        while(R<n){
            basket.put(fru[R], basket.getOrDefault(fru[R], 0) + 1);

            if(basket.size()>2){ // while to if
                basket.put(fru[L], basket.get(fru[L]) - 1); // decrease the type of Fru was at L

                if (basket.get(fru[L]) == 0) { // agar freq 0 he ho jae toh hta he do , kuki max do he rakhne hai
                    basket.remove(fru[L]);
                }
                L++;
            }
                if(basket.size()<=2){  // calulate bs tab kro jab ho skte ho 
                 maxFruits = Math.max(maxFruits, R - L + 1);
                }
        }
        System.out.println(maxFruits);
    }
    
}
