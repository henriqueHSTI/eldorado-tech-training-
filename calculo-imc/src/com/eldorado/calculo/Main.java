package com.eldorado.calculo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(Main.class.getName());

        double weight = 1.66;
        double height = 78.0;

        logger.log(Level.INFO, imcMessage(calcImc(weight, height)));

    }

    public static double calcImc(double weight, double height){
        return weight / (height * height);
    }

    public static String imcMessage(double imcResult){
        String response = "";
        if(imcResult >= 40) {
            response = "Obesity III (morbid)";
        } else if (imcResult >= 35) {
            response = "Obesity stage II (severe)";
        } else if (imcResult >= 30) {
            response = "Obesity stage I";
        } else if (imcResult >= 25) {
            response = "Slightly above the weight";
        } else if (imcResult >= 18.6) {
            response = "Ideal weight (congrats)";
        } else {
            response = "Below weight";
        }
        return response;
    }
}