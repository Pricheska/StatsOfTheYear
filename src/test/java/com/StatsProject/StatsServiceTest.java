package com.StatsProject;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

    long expectedSum = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

    @Test
    public void sumStats() {
        long actual = service.sum(sales);
        long expected = expectedSum;

        Assertions.assertEquals(expected, actual);
        System.out.println("Продажи за все месяцы составили = " + actual);
    }

    @Test
    public void statsAverage() {
        long actual = service.averageStats(sales);
        long expected = (expectedSum) / sales.length;

        Assertions.assertEquals(expected, actual);
        System.out.println("Среднее значение всех продаж за год = " + actual);
    }

    @Test
    public void maxMonth() {
        int actual = service.maxMonth(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
        System.out.println("Максимальные продажи получились  в " + actual + "-ом месяце");
    }

    @Test
    public void minMonth() {
        int actual = service.minMonth(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
        System.out.println("Минимальные продажи получились в " + actual + "-ом месяце");
    }

    @Test
    public void lessThanAverage() {
        long actual = service.lessThanAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
        System.out.println("Меньше среднего в " + actual + " месяцах");
    }
    @Test
    public void moreThanAverge() {
        long actual = service.moreThenAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
        System.out.println("Больше среднего в " + actual + " месяцах");
    }
}
