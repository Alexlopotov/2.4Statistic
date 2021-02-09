package ru.netology.stats;

public class StatsService {
    public int calculateSum (int[] purchase) {
        int amountSum = 0;
        for (int item : purchase) {
            amountSum = amountSum + item;
        }

        return amountSum;

    }
    public int calculateAverageAmount (int[] purchase) {
        int amountSum = calculateSum(purchase);
        int numberOfMonth = purchase.length;
        int averageAmount = amountSum / numberOfMonth;
        return averageAmount;
    }

    public int calculateNumberMaxSale (int[] purchase) {
        int numberMaxSale = 0;
        for (int n = 0; n < purchase.length; n++) {
            if (purchase[n] >= purchase[numberMaxSale]) {
                numberMaxSale = n;
            }
        }

        return numberMaxSale + 1;
    }
    public int calculateNumberMinSale(int[] purchase) {
        int numberMinSale = 0;
        for (int n = 0; n < purchase.length; n++) {
            if (purchase[n] <= purchase[numberMinSale]) {
                numberMinSale = n;
            }
        }

        return numberMinSale + 1;
    }

    public int calculateSaleUnderAverageAmount(int[] purchase) {
        int averageAmount = calculateAverageAmount(purchase);
        int amountMonth = 0;

        for (int n = 0; n < purchase.length; n++) {
            if (purchase[n] < averageAmount) {
                amountMonth = amountMonth + 1;
            }
        }

        return amountMonth;
    }

    public int calculateSaleOverAverageAmount(int[] purchase) {
        int averageSum = calculateAverageAmount(purchase);
        int amountMonth = 0;

        for (int n = 0; n < purchase.length; n++) {
            if (purchase[n] > averageSum) {
                amountMonth = amountMonth + 1;
            }
        }

        return amountMonth;
    }
}





