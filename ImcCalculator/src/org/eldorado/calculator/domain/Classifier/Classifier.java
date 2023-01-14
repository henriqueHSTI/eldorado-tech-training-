package org.eldorado.calculator.domain.Classifier;

import org.eldorado.calculator.domain.Classifier.model.Person;

public class Classifier {

    IWeightClassifier underweight;
    IWeightClassifier normal;
    IWeightClassifier overweight;
    IWeightClassifier obese;
    IWeightClassifier noClassification;

    public Classifier(IWeightClassifier underweight, IWeightClassifier normal, IWeightClassifier overweight, IWeightClassifier obese, IWeightClassifier noClassification) {
        this.underweight = underweight;
        this.normal = normal;
        this.overweight = overweight;
        this.obese = obese;
        this.noClassification = noClassification;
    }

    public IWeightClassifier classify(Person data){

        if(underweight.isOnRange(data))
            return underweight;

        if(normal.isOnRange(data))
            return normal;

        if(overweight.isOnRange(data))
            return overweight;

        if(obese.isOnRange(data))
            return obese;

        return noClassification;
    }

}
