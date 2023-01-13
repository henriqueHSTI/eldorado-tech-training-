package com.eldorado.calculo.start;

import com.eldorado.calculo.model.Person;
import com.eldorado.calculo.utils.ImcCalcUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartCalcImc {

    public void start() {

//        var person = new Person();
        var imcCalcUtil = new ImcCalcUtil();
//        person.setName("Kennedy");
//        person.setHeight(1.66);
//        person.setWeight(78.0);
//        person.setAge(25);
//        person.setGender('M');

//        imcCalcUtil.printImc(person.calcImc(), person);
//
//        imcCalcUtil.obesityLevel(person.imcMessage());

        String inputAnotherPerson = "yes";

        List<Person> persons = new ArrayList<>();

        while (inputAnotherPerson.equals("yes")) {
            Scanner scanner = new Scanner(System.in);
            var personWithInputData = new Person();
            System.out.println("name: ");
            personWithInputData.setName(scanner.nextLine());
            System.out.println("height: ");
            personWithInputData.setHeight(Double.parseDouble(scanner.nextLine()));
            System.out.println("weight: ");
            personWithInputData.setWeight(Double.parseDouble(scanner.nextLine()));
//            System.out.println("age");
//            personWithInputData.setAge(Integer.parseInt(scanner.nextLine()));
//            System.out.println("gender ('M' / 'W'):");
//            personWithInputData.setGender(scanner.nextLine().toCharArray()[0]);

            persons.add(personWithInputData);
            System.out.println("Imc result");
            System.out.println("----------");
            imcCalcUtil.printImc(personWithInputData.calcImc(), personWithInputData);

            System.out.println("Do you want to register someone else? ('yes' / 'no'");
            inputAnotherPerson = scanner.nextLine();
        }

    }
}