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

}
