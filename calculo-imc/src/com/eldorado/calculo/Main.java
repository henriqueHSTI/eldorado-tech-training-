package com.eldorado.calculo;

import com.eldorado.calculo.model.Person;
import com.eldorado.calculo.utils.ImcCalcUtil;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        var person = new Person();
        var imcCalcUtil = new ImcCalcUtil();
        person.setName("Kennedy");
        person.setHeight(1.66);
        person.setWeight(78.0);
        person.setAge(25);
        person.setGender('M');

        imcCalcUtil.printImc(person.calcImc());
    }


}