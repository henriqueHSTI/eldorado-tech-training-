package org.eldorado.calculator.domain.Classifier;

import org.eldorado.calculator.domain.Classifier.model.Person;

public abstract class WeightClassifier implements IWeightClassifier{
    @Override
    public abstract boolean isOnRange(Person data);

    @Override
    public String toString() {
        return "You're on: '" + getClass().getSimpleName() + "' weight";
    }
}
