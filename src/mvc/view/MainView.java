package mvc.view;

public interface MainView {
    void enterThePath();
    void displayResult90Percentile(Integer[] numbers);
    void displayResultMedian(double result);
    void displayResultAverage(double result);
    void displayResultMax(double result);
    void displayResultMin(double result);
}
