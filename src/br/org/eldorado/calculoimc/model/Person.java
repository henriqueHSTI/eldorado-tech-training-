package br.org.eldorado.calculoimc.model;

public class Person {

    private String name;
    private Integer age;
    private char gender;
    private double height;
    private double weight;
    private double imc;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s;%s;%s;%s", this.name, this.age, this.gender, this.height, this.weight, this.imc);
    }
}
