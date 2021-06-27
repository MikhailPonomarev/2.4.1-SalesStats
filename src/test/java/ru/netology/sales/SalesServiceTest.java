package ru.netology.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesServiceTest {
    @Test
    void totalYearSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.yearSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void averageMonthsSalesInYear() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageMonthSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void monthSalesMax() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;
        long actual = service.maxMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthSalesMin() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.minMonthSales(sales);

        assertEquals(expected, actual);
    }
    @Test
    void salesBelowAverage(){
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.belowAverageMonthSales(sales);

        assertEquals(expected, actual);
    }
    @Test
    void salesAboveAverage(){
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long expected = 5;
        long actual = service.aboveAverageMonthSales(sales);

        assertEquals(expected, actual);
    }
}


