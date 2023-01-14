package br.org.eldorado.calculoimc;

import br.org.eldorado.calculoimc.model.Person;
import br.org.eldorado.calculoimc.utils.FileManager;
import br.org.eldorado.calculoimc.utils.Imc;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {

    private static Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        final List<Person> people = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean hasToContinue = true;

        while (hasToContinue) {
            Person person = new Person();
            Imc imc = new Imc();

            System.out.println("Type your name:");
            person.setName(sc.nextLine());

            System.out.println("Type your age:");
            person.setAge(sc.nextInt());

            System.out.println("Type your gender:");
            person.setGender(sc.next().charAt(0));

            System.out.println("Type your height:");
            person.setHeight(sc.nextDouble());

            System.out.println("Type your weight:");
            person.setWeight(sc.nextDouble());

            double imcResult = imc.calculate(person);
            person.setImc(imcResult);

            LOGGER.log(Level.INFO, imc.info(person, imcResult));

            people.add(person);

            System.out.println("Type 'c' to continue or 's' to stop:");
            hasToContinue = Objects.equals(sc.next().charAt(0), 'c');

            sc.nextLine();
        }

        FileManager fileManager = new FileManager();

        fileManager.createFile(people);
        List<Person> registeredPeople = fileManager.readFile("people.txt");
        List<Person> filteredPeople = fileManager.filterByGender('m');

        LOGGER.log(Level.INFO, String.format("Registered people: %s || Filtered people: %s", registeredPeople.toString(), filteredPeople.toString()));
    }
}