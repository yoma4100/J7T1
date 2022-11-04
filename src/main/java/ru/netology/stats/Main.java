package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = new long[12];
        System.out.println("Сумма всех продаж: " + service.salesSum(sales));
        System.out.println("Средняя сумма продаж в месяц: " + service.salesSumAverage(sales));
        System.out.println("Последний месяц в котором был пик продаж: " + service.maxSales(sales));
        System.out.println("Последний месяц в котором был минимум продаж: " + service.minSales(sales));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + service.monthAmountBelowAverage(sales));
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + service.monthAmountAboveAverage(sales));
    }
}