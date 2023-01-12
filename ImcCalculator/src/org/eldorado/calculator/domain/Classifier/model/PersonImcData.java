package org.eldorado.calculator.domain.Classifier.model;

public class PersonImcData {

    double height;
    double weight;

    public PersonImcData(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public double getImc(){
        return weight / (height * height);
    }
}
