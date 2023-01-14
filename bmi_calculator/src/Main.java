import controller.BmiCalculatorApi;
import service.CsvReader;

public class Main {

    public static void main(String[] args) {
        BmiCalculatorApi bmiCalculatorApi = new BmiCalculatorApi();
        System.out.print("Welcome to the BMI calculator.\n");
        bmiCalculatorApi.run();
//        CsvReader.readCsv("file.txt");
    }
}