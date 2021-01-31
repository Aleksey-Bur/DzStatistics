package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    StatsService service = new StatsService();
    int[] realizations = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void realizationsSum() {

        int actual = service.realizationsSum(realizations);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void averageSum() {
        float actual = (long) service.averageSum(realizations);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void maxRealizationMonth() {

        float actual = service.maxRealizationMonth(realizations);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void minRealizationMonth() {

        float actual = service.minRealizationMonth(realizations);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void numberMonthsSalesBelowAverage() {

        float actual = service.numberMonthsSalesBelowAverage(realizations);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void numberMonthsAboveAverageSales() {

        float actual = service.numberMonthsAboveAverageSales(realizations);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
