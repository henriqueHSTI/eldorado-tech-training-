package org.eldorado.calculator.domain.Classifier;

import org.eldorado.calculator.domain.Classifier.model.PersonImcData;

public interface IWeightClassifier {

    boolean isOnRange(PersonImcData data);
    String toString();
}
