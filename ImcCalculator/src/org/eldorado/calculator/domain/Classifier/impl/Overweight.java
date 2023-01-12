package org.eldorado.calculator.domain.Classifier.impl;

import org.eldorado.calculator.domain.Classifier.WeightClassifier;
import org.eldorado.calculator.domain.Classifier.model.PersonImcData;

public class Overweight extends WeightClassifier {

    private double minValue = 25;
    private double maxValue = 30;
    @Override
    public boolean isOnRange(PersonImcData data) {
        return data.getImc() > minValue && data.getImc() < maxValue;
    }

}
