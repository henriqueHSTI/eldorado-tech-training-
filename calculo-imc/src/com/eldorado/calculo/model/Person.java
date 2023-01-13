package com.eldorado.calculo.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Person {

    final Logger logger = Logger.getLogger(Person.class.getName());

    double weight;
    double height;
    char gender;
    String name;
    int age;

    public Person(){

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", height=" + height +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public double calcImc(){
        return this.weight / (this.height * this.height);
    }

    public String imcMessage(){
        double imcResult = calcImc();
        String response = "";
        if(imcResult >= 40) {
            response = "Obesity III (morbid)";
        } else if (imcResult >= 35) {
            response = "Obesity stage II (severe)";
        } else if (imcResult >= 30) {
            response = "Obesity stage I";
        } else if (imcResult >= 25) {
            response = "Slightly above the weight";
        } else if (imcResult >= 18.6) {
            response = "Ideal weight (congrats)";
        } else {
            response = "Below weight";
        }
        return response;
    }

}
