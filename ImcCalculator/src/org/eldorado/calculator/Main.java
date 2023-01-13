package org.eldorado.calculator;

import org.eldorado.calculator.domain.Classifier.Classifier;
import org.eldorado.calculator.domain.Classifier.IWeightClassifier;
import org.eldorado.calculator.domain.Classifier.impl.*;
import org.eldorado.calculator.domain.Classifier.model.PersonImcData;
import org.eldorado.calculator.domain.utils.PersonCreatorCli;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IWeightClassifier underweight = new Underweight();
        IWeightClassifier normal = new Normal();
        IWeightClassifier overweight = new Overweight();
        IWeightClassifier obese = new Obese();
        IWeightClassifier noClassification = new NoClassification();

        Classifier classifier = new Classifier(underweight, normal, overweight, obese, noClassification);

        PersonCreatorCli cli = new PersonCreatorCli(scanner);

        var data = cli.createPerson();

        //PersonImcData data = new PersonImcData(1.76, 0, "fulano", 'M', LocalDate.of(1995, 1, 16));

        Logger.getLogger(Main.class.getSimpleName()).info(classifier.classify(data).toString());

    }
}