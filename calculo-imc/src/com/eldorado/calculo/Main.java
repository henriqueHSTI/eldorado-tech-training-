package com.eldorado.calculo;

import com.eldorado.calculo.model.Person;
import com.eldorado.calculo.utils.ImcCalcUtil;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        var person = new Person();
        var imcCalcUtil = new ImcCalcUtil();
        person.setName("Kennedy");
        person.setHeight(1.66);
        person.setWeight(78.0);
        person.setAge(25);
        person.setGender('M');

        imcCalcUtil.printImc(person.calcImc(), person);

        imcCalcUtil.obesityLevel(person.imcMessage());

        boolean inputAnotherPerson = true;

        while (inputAnotherPerson) {
            Scanner scanner = new Scanner(System.in);
            var personWithInputData = new Person();
            System.out.println("name: ");
            personWithInputData.setName(scanner.nextLine());
            System.out.println("height: ");
            personWithInputData.setHeight(Double.parseDouble(scanner.nextLine()));
            System.out.println("weight: ");
            personWithInputData.setWeight(Double.parseDouble(scanner.nextLine()));
            System.out.println("age");
            personWithInputData.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.println("gender ('M' / 'W'):");
            personWithInputData.setGender(scanner.nextLine().toCharArray()[0]);

            System.out.println("Imc result");
            System.out.println("----------");
            imcCalcUtil.printImc(personWithInputData.calcImc(), personWithInputData);

            inputAnotherPerson = Boolean.valueOf(scanner.nextLine());
        }

    }


    private static double readUserValue(Scanner scanner){
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            logger.log(Level.SEVERE, String.format("Invalid type value -> %s", scanner.nextDouble()));
        }
        return Double.MIN_VALUE;
    }


}