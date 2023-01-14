package org.eldorado.calculator.domain.Classifier.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {

    double height;
    double weight;
    String name;
    char gender;
    LocalDate birthday;

    public Person(double height, double weight, String name, char gender, LocalDate birthday) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Person(String height, String weight, String name, String gender, String birthday) {
        this(Double.parseDouble(height), Double.parseDouble(weight), name, gender.charAt(0), LocalDate.parse(birthday));
    }

    public double getImc(){
        return weight / (height * height);
    }

    public int getIdade() {

         int age = LocalDate.now().compareTo(this.birthday); // return comparation of years
         if (LocalDate.now().getMonthValue() < this.birthday.getMonthValue())
             age--;
        if (this.birthday.getMonthValue() == LocalDate.now().getMonthValue() && LocalDate.now().getDayOfMonth() < this.birthday.getDayOfMonth() )
            age--;
        return age;
    }

    @Override
    public String toString() {
        return "{" +
                "height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
