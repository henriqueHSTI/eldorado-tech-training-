package org.eldorado.calculo.utils;

import org.eldorado.calculo.models.Person;

public class CalculatorIMC {

    public static final String TEMPLATE_MC_CLASSIFICATION_OBESITY = "MC: %s\n Classification: %s\n Obesity Level: %s";

    public String printInfo(double imc){
        if(imc <18.5){
            return String.format(TEMPLATE_MC_CLASSIFICATION_OBESITY, imc,"thinness","0");
        }else if(imc < 25){
            return String.format(TEMPLATE_MC_CLASSIFICATION_OBESITY, imc,"Normal","0");
        }else if (imc < 30){
            return String.format(TEMPLATE_MC_CLASSIFICATION_OBESITY, imc,"Overweight","I");
        }else if (imc < 40){
            return String.format(TEMPLATE_MC_CLASSIFICATION_OBESITY, imc,"Obesity","II");
        }else{
            return String.format(TEMPLATE_MC_CLASSIFICATION_OBESITY, imc,"Severe Obesity","III");
        }
    }

    public double calculateIMC(Person person){
        return person.getWeight()/(person.getHeight()* person.getHeight());
    }

}
