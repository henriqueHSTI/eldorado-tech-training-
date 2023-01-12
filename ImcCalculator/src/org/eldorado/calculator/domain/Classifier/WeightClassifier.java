package org.eldorado.calculator.domain.Classifier;

import org.eldorado.calculator.domain.Classifier.model.PersonImcData;

public abstract class WeightClassifier implements IWeightClassifier{
    @Override
    public abstract boolean isOnRange(PersonImcData data);

    @Override
    public String toString() {
        return "You're on: '" + getClass().getSimpleName() + "' weight";
    }
}
