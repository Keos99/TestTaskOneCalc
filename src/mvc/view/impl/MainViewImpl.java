package mvc.view.impl;

import mvc.view.MainView;

public class MainViewImpl implements MainView {
    @Override
    public void enterThePath() {
        System.out.println("Введите путь к файлу");
    }

    @Override
    public void displayResult90Percentile(Integer[] result) {
        for (Integer integer : result) {
            System.out.println("90 percentile " + integer);
        }
    }

    @Override
    public void displayResultMedian(double result) {
        System.out.println("median " + result);
    }

    @Override
    public void displayResultAverage(double result) {
        System.out.println("average " + result);
    }

    @Override
    public void displayResultMax(double result) {
        System.out.println("max " + result);
    }

    @Override
    public void displayResultMin(double result) {
        System.out.println("min " + result);
    }
}
