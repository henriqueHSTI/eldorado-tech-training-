package br.org.eldorado.calculoimc;

import br.org.eldorado.calculoimc.model.Person;
import br.org.eldorado.calculoimc.utils.Imc;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        var person = new Person();
        var imc = new Imc();

        Scanner sc = new Scanner(System.in);

        boolean hasToContinue = true;

        while (hasToContinue) {
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

            LOGGER.log(Level.INFO, imc.info(person, imcResult));

            System.out.println("Type 'c' to continue or 's' to stop:");
            hasToContinue = Objects.equals(sc.next().charAt(0), 'c');

            sc.nextLine();
        }

    }
}