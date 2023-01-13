package service;

import entity.Person;

public class BmiCalculatorService {

    public double getBmi(Person person) {
        double bmi = person.getWeight() / Math.pow(person.getHeight(), 2);
        return bmi;
    }

    public String getBmiClassification(double bmi) {
        String bmiClassification;

        if (bmi < 18.5) {
            bmiClassification = "0 - Underweight.";
        } else if (bmi < 25) {
            bmiClassification = "I - Normal.";
        } else if (bmi < 30) {
            bmiClassification = "II - Overweight.";
        } else if (bmi < 40) {
            bmiClassification = "III - Obese.";
        } else {
            bmiClassification = "IV - Morbid obese.";
        }
        return bmiClassification;
    }
}
