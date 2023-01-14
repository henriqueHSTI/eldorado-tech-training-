package controller;

import entity.Person;
import service.BmiCalculatorService;
import service.CsvReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Logger;

import static java.lang.System.exit;


public class BmiCalculatorApi {

    private static final Logger LOGGER = Logger.getLogger(BmiCalculatorApi.class.getName());
    Scanner scanner = new Scanner(System.in);
    Person person = new Person();

    public void run() {
        menu();
    }

    public void calculator() {
        BmiCalculatorService bmiCalculatorService = new BmiCalculatorService();

        System.out.print("Please fill in your data: \n");

        try {
            System.out.print("Your name: ");
            person.setName(scanner.nextLine());

            System.out.print("Your weight (kg): ");
            person.setWeight(Double.parseDouble(scanner.nextLine()));

            System.out.print("Your height (m,cm): ");
            person.setHeight(Double.parseDouble(scanner.nextLine()));

            System.out.print("Your gender (M/F): ");
            person.setGender(scanner.nextLine().toUpperCase().charAt(0));

            System.out.print("Your age: ");
            person.setAge(Integer.parseInt(scanner.nextLine()));

            double bmi = bmiCalculatorService.getBmi(person);
            person.setBmi(bmiCalculatorService.getBmiClassification(bmi));

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt", true));
            bufferedWriter.append(person.toCSV() + "\n");
            bufferedWriter.close();

        } catch (Exception ex) {
            System.out.println("Invalid values.");
            calculator();
        }

        menu();


    }

    private void menu() {
        System.out.print("Type ENTER to continue or EXIT to close the application: ");
        String menu = null;
        menu = scanner.nextLine().toLowerCase();

        switch (menu) {
            case "enter":
                calculator();
                break;
            case "exit":
                exit(0);
                break;
            default:
                run();
        }
    }
}

