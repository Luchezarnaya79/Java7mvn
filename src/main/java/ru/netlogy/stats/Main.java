package ru.netlogy.stats;

public class Main {
    public static void main(String[] args) {

        long [] arr={8,15,13,15,17,20,19,20,7,14,14,18};

        StatsService statsService= new StatsService();
        System.out.println("Сумма =" + statsService.SummaSales(arr));

        StatsService statsService1= new StatsService();
        System.out.println("Среднее значение в месяц =" + statsService1.AverageSales(arr));

        StatsService statsService2= new StatsService();
        System.out.println("номер месяца с минимальными продажами =" + statsService2.minSales(arr));

        StatsService statsService3= new StatsService();
        System.out.println("номер месяца с максимальными продажами =" + statsService3.maxSales(arr));

        StatsService statsService4= new StatsService();
        System.out.println("Количество дней с продажами меньше среднего =" + statsService4.BelowAverageSales(arr));

        StatsService statsService5= new StatsService();
        System.out.println("Количество дней с продажами выше среднего =" + statsService5.AboveAverageSales(arr));

    }
}