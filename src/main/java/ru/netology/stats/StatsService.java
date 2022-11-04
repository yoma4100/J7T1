package ru.netology.stats;

public class StatsService {
    public long salesSum (long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long salesSumAverage (long[] sales) {
        long sum = salesSum(sales);
        long sumAverage = sum / 12;
        return sumAverage;
    }

    public long maxSales (long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSales (long[] sales) {
        int mixMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[mixMonth]) {
                mixMonth = month;
            }
            month = month + 1;
        }
        return mixMonth + 1;
    }

    public long monthAmountBelowAverage (long[] sales) {
        int amountMonth = 0;
        int month = 0;
        long sumAverage = salesSumAverage(sales);
        for (long sale : sales) {
            if (sales[month] < sumAverage) {
                amountMonth +=1;
            }
            month +=1;
        }
        return amountMonth;
    }

    public long monthAmountAboveAverage (long[] sales) {
        int amountMonth = 0;
        int month = 0;
        long sumAverage = salesSumAverage(sales);
        for (long sale : sales) {
            if (sales[month] > sumAverage) {
                amountMonth +=1;
            }
            month +=1;
        }
        return amountMonth;
    }
}
