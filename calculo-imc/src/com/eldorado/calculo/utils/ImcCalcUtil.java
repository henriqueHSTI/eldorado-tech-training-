package com.eldorado.calculo.utils;

import com.eldorado.calculo.model.Person;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ImcCalcUtil {

    final Logger logger = Logger.getLogger(ImcCalcUtil.class.getName());
    public void printImc(double imc, Person person){
        String response = "";
        if(imc >= 40) {
            response = "Obesity III (morbid)";
        } else if (imc >= 35) {
            response = "Obesity stage II (severe)";
        } else if (imc >= 30) {
            response = "Obesity stage I";
        } else if (imc >= 25) {
            response = "Slightly above the weight";
        } else if (imc >= 18.6) {
            response = "Ideal weight (congrats)";
        } else {
            response = "Below weight";
        }

        logger.log(Level.INFO, person.toString());
        logger.log(Level.INFO, response);
    }
}
