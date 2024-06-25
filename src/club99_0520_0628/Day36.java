package club99_0520_0628;

import java.util.Arrays;

public class Day36 {
//    int[] prices = {8,4,6,2,3};
//    int[] prices = {1,2,3,4,5};
    int[] prices = {10,1,1,6};
    int[] result;

    public Day36() {
        finalPrices(this.prices);
    }

    public String getResult() {
        return Arrays.toString(result);
    }

    public int[] finalPrices(int[] prices) {
        result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            result[i] = prices[i];
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) { //
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return result;
    }
}
