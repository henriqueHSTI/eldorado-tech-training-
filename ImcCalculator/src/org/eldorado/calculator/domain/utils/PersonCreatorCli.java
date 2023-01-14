package org.eldorado.calculator.domain.utils;

import org.eldorado.calculator.domain.Classifier.model.Person;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class PersonCreatorCli implements Serializable {

    Logger LOGGER;
    Scanner scanner;

    public PersonCreatorCli(Scanner scanner){
        this.scanner = scanner;
        this.LOGGER = Logger.getLogger("PersonCreatorCli");
    }

    public List<Person> createMultiplePerson(){
        var people = new ArrayList<Person>();
        var option = false;
        do {
            var person = createPerson();
            people.add(person);
            System.out.println("Create new [y/n]: ");
            option = scanner.nextLine().toLowerCase().charAt(0) == 'y'? true : false;
        } while(option);
        return people;
    }
    public Person createPerson(){
        String name = getName();

        LocalDate birthday = getLocalDate();

        double height = getHeight();

        double weight = getWeight();

        char gender = getGender();

        return new Person(height, weight, name, gender, birthday);
    }

    private String getName() {
        System.out.println("Name: ");
        return scanner.nextLine();
    }

    private LocalDate getLocalDate() {
        boolean gotExecption = true;
        LocalDate birthday = null;
        do {
            try {
                System.out.println("Birthday: ");
                birthday = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                gotExecption = false;
                return birthday;
            } catch (DateTimeParseException exception) {
                LOGGER.warning("Invalid birthday, please use the following pattern: yyyy-mm-dd");
            }
        } while(gotExecption);
        return birthday;
    }

    private double getHeight() {
        System.out.println("Height: ");
        return Double.parseDouble(scanner.nextLine().replace(",","."));
    }

    private double getWeight() {
        System.out.println("Weight: ");
        return Double.parseDouble(scanner.nextLine().replace(",","."));
    }

    private char getGender() {
        System.out.println("Gender: ");
        return  scanner.nextLine().charAt(0);
    }

}
