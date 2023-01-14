package org.eldorado.calculator.domain.Classifier.impl;

import org.eldorado.calculator.domain.Classifier.WeightClassifier;
import org.eldorado.calculator.domain.Classifier.model.Person;

public class Obese extends WeightClassifier {

    private double minValue = 30;
    @Override
    public boolean isOnRange(Person data) {
        return data.getImc() > minValue;
    }

}
