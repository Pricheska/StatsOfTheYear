package com.StatsProject;

public class StatsService {

    public long sum(long[] sales) {

        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long averageStats(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxMonth(long[] sales) {
        int maxMounth = 0;
        long maxSale = sales[maxMounth];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMounth = i;
                maxSale = sales[i];
            }
        }
        return maxMounth + 1;
    }

    public int minMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public long lessThanAverage(long[] sales) {
        long counter = 0;
        for (long sale : sales) {
            if (sale < averageStats(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public long moreThenAverage(long[] sales) {
        long counter = 0;
        for (long sale : sales) {
            if (sale > averageStats(sales)) {
                counter++;
            }
        }
        return counter;
            }

        }