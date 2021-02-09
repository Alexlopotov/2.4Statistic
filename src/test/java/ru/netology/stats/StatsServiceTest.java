package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int actual = service.calculateSum(purchase);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageAmount() {
        StatsService service = new StatsService();
        int actual = service.calculateAverageAmount(purchase);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void calculateNumberMaxSale() {
        StatsService service = new StatsService();
        int actual = service.calculateNumberMaxSale(purchase);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void calculateNumberMinSale() {
        StatsService service = new StatsService();
        int actual = service.calculateNumberMinSale(purchase);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void calculateSaleUnderAverageAmount() {
        StatsService service = new StatsService();
        int actual = service.calculateSaleUnderAverageAmount(purchase);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void calculateSaleOverAverageAmount() {
        StatsService service = new StatsService();
        int actual = service.calculateSaleOverAverageAmount(purchase);
        int expected = 5;
        assertEquals(expected, actual);
    }
}