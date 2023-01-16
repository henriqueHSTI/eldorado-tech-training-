package com.eldorado.calculo.model;

public class Person {
    Double height;
    Double weight;
    String name;
    String gender;
    Integer age;
    Double imc;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    @Override
    public String toString() {
        return "\"pessoa\": {" +
                "\"altura\": " + this.height +
                ", \"peso\": " + this.weight  +
                ", \"nome\": \"" + this.name + "\"" +
                ", \"idade\": " + this.age +
                "}";
    }
}
