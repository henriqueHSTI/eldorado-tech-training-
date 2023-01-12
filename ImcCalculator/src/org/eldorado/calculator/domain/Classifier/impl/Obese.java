package org.eldorado.calculator.domain.Classifier.impl;

import org.eldorado.calculator.domain.Classifier.WeightClassifier;
import org.eldorado.calculator.domain.Classifier.model.PersonImcData;

public class Obese extends WeightClassifier {

    private double minValue = 30;
    @Override
    public boolean isOnRange(PersonImcData data) {
        return data.getImc() > minValue;
    }

}
