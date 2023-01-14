package org.eldorado.calculator.domain.Classifier;

import org.eldorado.calculator.domain.Classifier.model.Person;

public interface IWeightClassifier {

    boolean isOnRange(Person data);
    String toString();
}
