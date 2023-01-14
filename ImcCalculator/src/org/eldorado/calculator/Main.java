package org.eldorado.calculator;

import org.eldorado.calculator.domain.Classifier.Classifier;
import org.eldorado.calculator.domain.Classifier.IWeightClassifier;
import org.eldorado.calculator.domain.Classifier.impl.*;
import org.eldorado.calculator.domain.Classifier.model.Person;
import org.eldorado.calculator.domain.utils.PersonCreatorCli;
import org.eldorado.calculator.infrastructure.database.fileDatabase.IFileDatabase;
import org.eldorado.calculator.infrastructure.database.fileDatabase.impl.PersonFileDatabase;
import org.eldorado.calculator.infrastructure.repository.IFileRepository;
import org.eldorado.calculator.infrastructure.repository.impl.PersonFileRepository;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PersonCreatorCli cli = new PersonCreatorCli(scanner);
        File file = new File("./database.txt");
        IFileDatabase<Person> database = new PersonFileDatabase(file);
        IFileRepository<Person> repository = new PersonFileRepository(database);

        IWeightClassifier underweight = new Underweight();
        IWeightClassifier normal = new Normal();
        IWeightClassifier overweight = new Overweight();
        IWeightClassifier obese = new Obese();
        IWeightClassifier noClassification = new NoClassification();

        Classifier classifier = new Classifier(underweight, normal, overweight, obese, noClassification);


        var values = repository.readAll(file);
        values.forEach(data -> {
            Logger.getLogger(Main.class.getSimpleName()).info(classifier.classify(data).toString());
        });

        var dataList = cli.createMultiplePerson();

        dataList.forEach(data -> {
            Logger.getLogger(Main.class.getSimpleName()).info(classifier.classify(data).toString());
            repository.save(data);
        });

        scanner.close();
    }
}