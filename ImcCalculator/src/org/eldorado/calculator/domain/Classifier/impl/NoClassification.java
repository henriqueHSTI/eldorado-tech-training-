package org.eldorado.calculator.domain.Classifier.impl;

import org.eldorado.calculator.domain.Classifier.WeightClassifier;
import org.eldorado.calculator.domain.Classifier.model.Person;

public class NoClassification extends WeightClassifier {
    @Override
    public boolean isOnRange(Person data) {
        return false;
    }
}
