package org.eldorado.calculator;

import org.eldorado.calculator.domain.Classifier.Classifier;
import org.eldorado.calculator.domain.Classifier.IWeightClassifier;
import org.eldorado.calculator.domain.Classifier.impl.*;
import org.eldorado.calculator.domain.Classifier.model.PersonImcData;

public class Main {
    public static void main(String[] args) {

        IWeightClassifier underweight = new Underweight();
        IWeightClassifier normal = new Normal();
        IWeightClassifier overweight = new Overweight();
        IWeightClassifier obese = new Obese();
        IWeightClassifier noClassification = new NoClassification();

        Classifier classifier = new Classifier(underweight, normal, overweight, obese, noClassification);

        PersonImcData data = new PersonImcData(1.76, 0);

        System.out.println(classifier.classify(data));

    }
}