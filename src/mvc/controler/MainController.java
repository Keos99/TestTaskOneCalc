package mvc.controler;

import mvc.model.Calc;
import mvc.model.FileHandler;
import mvc.model.impl.CalcImpl;
import mvc.model.impl.MainModel;
import mvc.view.MainView;
import mvc.view.impl.MainViewImpl;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private Scanner scanner;
    private FileHandler model;
    private MainView view;
    private File file;
    private List<Integer> numbers;
    private Integer[] numbersArray;
    private Calc calc;

    public MainController(String[] args){
        model = new MainModel();
        view = new MainViewImpl();
        scanner = new Scanner(System.in);
        calc = new CalcImpl();
        run(args);
    }

    public void run(String[] args) {
        if (args.length != 0){
            file = model.getFilePath(args[0]);
        } else {
            view.enterThePath();
            file = model.getFilePath(scanner.nextLine());
        }
        numbers = model.processFile(file);
        numbersArray = new Integer[numbers.size()];
        numbersArray = numbers.toArray(numbersArray);

        view.displayResult90Percentile(calc.percentiles(numbersArray,0.9));
        view.displayResultMedian(calc.median(numbersArray));
        view.displayResultAverage(calc.average(numbersArray));
        view.displayResultMax(calc.max(numbersArray));
        view.displayResultMin(calc.min(numbersArray));
    }


}
