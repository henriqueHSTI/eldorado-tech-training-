package org.eldorado.calculator.domain.Classifier.impl;

import org.eldorado.calculator.domain.Classifier.WeightClassifier;
import org.eldorado.calculator.domain.Classifier.model.PersonImcData;

public class NoClassification extends WeightClassifier {
    @Override
    public boolean isOnRange(PersonImcData data) {
        return false;
    }
}
