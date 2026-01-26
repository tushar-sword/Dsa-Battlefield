package SlideWindowTwoPointers.MediumLevel.FruitInBasket;

import java.util.HashMap;
import java.util.Map;

public class bruteForce {

    public static void main(String args[]){
        int fru[]= { 1, 2, 3, 2, 2};
        int maxFruits=0;

        for (int i= 0; i < fru.length; i++) {

            Map<Integer, Integer> basket = new HashMap<>();
              int currentCount = 0;

                 for (int j=i; j< fru.length; j++) {

                         basket.put(fru[j], basket.getOrDefault(fru[j], 0) + 1);
                         if(basket.size()>2){
                            break;
                         }
                           currentCount++;
                    }
                    maxFruits = Math.max(maxFruits, currentCount);
              }
              System.out.println(maxFruits);
    }
}

// TC = N^2
// SC = 2
