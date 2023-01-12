package org.eldorado.calculator.domain.Classifier.impl;

import org.eldorado.calculator.domain.Classifier.WeightClassifier;
import org.eldorado.calculator.domain.Classifier.model.PersonImcData;

public class Underweight extends WeightClassifier {

    private double maxValue = 18.5;
    @Override
    public boolean isOnRange(PersonImcData data) {
        return data.getImc() < maxValue;
    }
}
