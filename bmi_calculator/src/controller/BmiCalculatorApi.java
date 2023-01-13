package controller;

import entity.Person;
import service.BmiCalculatorService;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.System.exit;


public class BmiCalculatorApi {

    private static final Logger LOGGER = Logger.getLogger(BmiCalculatorApi.class.getName());

    Person person = new Person();

    public void start() {
        BmiCalculatorService bmiCalculatorService = new BmiCalculatorService();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Your name: ");
            person.setName(scanner.next());

            System.out.print("Your weight (kg): ");
            person.setWeight(scanner.nextDouble());

            System.out.print("Your height (m,cm): ");
            person.setHeight(scanner.nextDouble());

            System.out.print("Your gender (M/F): ");
            person.setGender(scanner.next().charAt(0));

            System.out.print("Your age: ");
            person.setAge(scanner.nextInt());

        } catch (Exception ex){
            LOGGER.log(Level.SEVERE, "Incorrect value. Restart the application.");
            exit(0);
        }

        double bmi = bmiCalculatorService.getBmi(person);
        String bmiClassification = bmiCalculatorService.getBmiClassification(bmi);

        LOGGER.log(Level.INFO, "{0} \nBMI: {1} \nClassification: {2}", new Object[] {person.toString(), bmi, bmiClassification});
    }

}
