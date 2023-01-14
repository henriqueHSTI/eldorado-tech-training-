package org.eldorado.calculator.domain.Classifier.impl;

import org.eldorado.calculator.domain.Classifier.WeightClassifier;
import org.eldorado.calculator.domain.Classifier.model.Person;

public class Normal extends WeightClassifier {

    private double minValue = 18.5;
    private double maxValue = 25;
    @Override
    public boolean isOnRange(Person data) {
        return data.getImc() > minValue && data.getImc() < maxValue;
    }

}
