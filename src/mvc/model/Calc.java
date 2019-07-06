package mvc.model;

public interface Calc {
    Integer[] percentiles(Integer[] numbers, double... percentiles);
    double median(Integer[] numbers);
    double average(Integer[] numbers);
    double max(Integer[] numbers);
    double min(Integer[] numbers);
}
