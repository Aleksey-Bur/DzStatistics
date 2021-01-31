package ru.netology.stats;

public class StatsService {

    public int realizationsSum(int[] realizations) {

        int sum = 0;
        for (int realization : realizations) {
            sum += realization;
        }
        return sum;
    }

    public float averageSum(int[] realizations) {
        return (float) realizationsSum(realizations) / realizations.length;
    }

    public int maxRealizationMonth(int[] realizations) {
        int maxRealization = realizations[0];
        int month = 1;
        int monthMax = 0;
        for (int realization : realizations) {
            if (realization >= maxRealization) {
                maxRealization = realization;
                monthMax = month;
            }
            month++;
        }
        return monthMax;
    }

    public int minRealizationMonth(int[] realizations) {
        int minRealization = realizations[0];
        int month = 1;
        int monthMin = 0;
        for (int realization : realizations) {
            if (realization <= minRealization) {
                minRealization = realization;
                monthMin = month;
            }
            month++;
        }
        return monthMin;
    }

    public int numberMonthsSalesBelowAverage(int[] realizations) {
        float average = averageSum(realizations);
        int quantityMonth = 0;
        for (int realization : realizations) {
            if (realization < average) {quantityMonth++;}
        }
        return quantityMonth;
    }

    public int numberMonthsAboveAverageSales(int[] realizations) {
        float average = averageSum(realizations);
        int quantityMonth = 0;
        for (int realization : realizations) {
            if (realization > average) {quantityMonth++;}
        }
        return quantityMonth;
    }
}