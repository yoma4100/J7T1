package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesAnalysisServiceTest {

    @Test
    public void shouldCalcSum() {
        StatsService service = new StatsService();
        long[] sales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        long expected = 12;
        long actual = service.salesSum(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcAverage() {
        StatsService service = new StatsService();
        long[] sales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        long expected = 1;
        long actual = service.salesSumAverage(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldFindLastMonthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1};
        long expected = 11;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldFindLastMonthMinSales() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1};
        long expected = 12;
        long actual = service.minSales(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldFindMonthAmountBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {2, 2, 2, 2, 2, 0, 2, 2, 0, 2, 2, 2};
        long expected = 2;
        long actual = service.monthAmountBelowAverage(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldFindMonthAmountAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {2, 2, 2, 2, 2, 3, 2, 2, 3, 2, 2, 2};
        long expected = 2;
        long actual = service.monthAmountAboveAverage(sales);

        Assertions.assertEquals(actual, expected);
    }
}
