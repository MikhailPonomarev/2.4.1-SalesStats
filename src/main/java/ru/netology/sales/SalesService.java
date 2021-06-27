package ru.netology.sales;

public class SalesService {
    public long yearSales(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }


    public long averageMonthSales(long[] sales) {
        long monthSales = yearSales(sales) / sales.length;
        return monthSales;
    }


    public long maxMonthSales(long[] sales) {
        long currentMonth = 0;
        long monthMaxSale = 0;
        long maxSale = sales[0];
        for (long sale : sales) {
            if (sale >= maxSale) {
                maxSale = sale;
                monthMaxSale = currentMonth;
            }
            currentMonth++;
        }
        return monthMaxSale;
    }


    public long minMonthSales(long[] sales) {
        long monthNow = 0;
        long monthMinSale = 0;
        long minSale = sales[0];
        for (long sale : sales) {
            if (sale <= minSale) {
                minSale = sale;
                monthMinSale = monthNow;
            }
            monthNow++;
        }
        return monthMinSale;
    }


    public long belowAverageMonthSales(long[] sales) {
        long monthQuantity = 0;
        for (long sale : sales) {
            if (sale < averageMonthSales(sales)) {
                monthQuantity++;
            }
        }
        return monthQuantity;
    }


    public long aboveAverageMonthSales(long[] sales) {
        long monthQuantity = 0;
        for (long sale : sales) {
            if (sale < averageMonthSales(sales)) {
                monthQuantity++;
            }
        }
        return monthQuantity;
    }
}
