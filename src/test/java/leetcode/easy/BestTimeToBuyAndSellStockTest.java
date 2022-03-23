package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockTest {

    @Test
    void example1() {
        assertThat(BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
    }

    @Test
    void example2() {
        assertThat(BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
    }

    @Test
    void example3() {
        assertThat(BestTimeToBuyAndSellStock.maxProfit(new int[]{2, 4, 1})).isEqualTo(2);
    }
}