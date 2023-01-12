package com.eldorado.calculo;

import com.eldorado.calculo.model.Person;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(Main.class.getName());

        var person = new Person();
        person.setName("Kennedy");
        person.setHeight(1.66);
        person.setWeight(78.0);
        person.setAge(25);
        person.setGender('M');

        logger.log(Level.INFO, person.imcMessage());

    }


}