package ru.netlogy.stats;

public class StatsService {

    public long SummaSales(long[] sales) {

        long Sum = 0;
        for (long sale : sales) {
            Sum += sale;
        }
        return Sum;
    }

    public long AverageSales(long[] sales) {

        return  SummaSales(sales) / sales.length;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int BelowAverageSales(long[] sales) {
        long avr = AverageSales(sales);
        int belowAverage = 0;
        for (long sale : sales) {
            if (sale < avr) {
                belowAverage++;

            }
        }
        return belowAverage;
    }

    public int AboveAverageSales(long[] sales) {
        long avr = AverageSales(sales);
        int AboveAverage = 0;

        for (long sale : sales) {
            if (sale > avr) {
                AboveAverage++;

            }
        }
        return AboveAverage;
    }
}
