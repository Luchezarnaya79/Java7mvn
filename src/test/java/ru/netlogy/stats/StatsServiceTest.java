package ru.netlogy.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {


    @Test
    public void SumTest() {

        StatsService service =new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long actual =service.SummaSales(sales);
        long expected= 8+15+13+15+17+20+19+20+7+14+14+18;

        assertEquals(expected, actual);
    }

    @Test
    public void AverageSalesTest() {

        StatsService service =new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long actual =service.AverageSales(sales);
        long expected= 15;

        assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {

        StatsService service =new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long actual =service.minSales(sales);
        long expected= 9;

        assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {

        StatsService service =new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long actual =service.maxSales(sales);
        long expected= 8;

        assertEquals(expected, actual);
    }

    @Test
    public void BelowAverageSalesTest() {

        StatsService service =new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long actual =service.BelowAverageSales(sales);
        long expected= 5;

        assertEquals(expected, actual);
    }

    @Test
    public void AboveAverageSalesTest() {

        StatsService service =new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long actual =service.AboveAverageSales(sales);
        long expected= 5;

        assertEquals(expected, actual);
    }
}
