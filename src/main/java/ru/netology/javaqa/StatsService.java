package ru.netology.javaqa;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;

        for (int value : sales) {
            sum += value;
        }
        return sum;
    }

    public int calculateAvg(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int SumUnderAverage(int[] sales) {
        int count = 0;
        int sumAverage = calculateAvg(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sumAverage) {
                count++;
            }
        }
        return count;
    }

    public int SumOverAverege(int[] sales) {
        int count = 0;
        int averegeSales = calculateAvg(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averegeSales) {
                count++;
            }
        }
        return count;
    }

}