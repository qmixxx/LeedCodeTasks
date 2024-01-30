
import org.junit.jupiter.api.Test;
import org.leetcode.easy.BestTimeBuySellStock;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BestTimeBuySellStockTest {

    @Test
    public void timeBuySellStockTest() {

        BestTimeBuySellStock stock = new BestTimeBuySellStock();

        assertEquals(
                5,
                stock.getProfit(new int[] {7,1,5,3,6,4}),
                "Error"
        );

        assertEquals(
                0,
                stock.getProfit(new int[] {7,6,4,3,1}),
                "Error"
        );

        assertEquals(
                2,
                stock.getProfit(new int[] {2,4, 1}),
                "Error"
        );

        assertEquals(
                17,
                stock.getProfit(new int[] {4, 3, 8, 10, 20}),
                "Error"
        );

        assertEquals(
                17,
                stock.getProfit(new int[] {4, 3, 8, 10, 20}),
                "Error"
        );





    }

}
