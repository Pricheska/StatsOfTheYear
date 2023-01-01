package com.StatsProject;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumStats() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
        System.out.println("Продажи за все месяцы составили = " + actual);
    }

    @Test
    public void statsEverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.everageStats(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
        System.out.println("Среднее значение всех продаж за год = " + actual);
    }

    @Test
    public void maxMounth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxMounth(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
        System.out.println("Максимальные продажи получились  в " + actual + "-ом месяце");
    }

    @Test
    public void minMounth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minMounth(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
        System.out.println("Минимальные продажи получились в " + actual + "-ом месяце");
    }
    @Test
    public void lessThenEverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.lessThenEverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
        System.out.println("меньше среднего в " + actual);
    }
}