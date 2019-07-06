package mvc.model.impl;

import mvc.model.Calc;

import java.util.Arrays;

public class CalcImpl implements Calc {

    @Override
    public Integer[] percentiles(Integer[] numbers, double... percentiles) {
        Arrays.sort(numbers, 0, numbers.length);
        Integer[] values = new Integer[percentiles.length];
        for (int i = 0; i < percentiles.length; i++) {
            int index = (int) (percentiles[i] * numbers.length);
            values[i] = numbers[index];
        }
        return values;
    }

    @Override
    public double median(Integer[] numbers) {
        Arrays.sort(numbers, 0, numbers.length);
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 1) {
            return numbers[middle];
        } else {
            return (numbers[middle] + numbers[middle] - 1) / 2.0;
        }
    }

    @Override
    public double average(Integer[] numbers) {
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        return average/numbers.length;
    }

    @Override
    public double max(Integer[] numbers) {
        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }

    @Override
    public double min(Integer[] numbers) {
        double min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }
}
