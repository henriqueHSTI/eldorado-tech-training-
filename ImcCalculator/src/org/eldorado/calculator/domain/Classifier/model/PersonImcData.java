package org.eldorado.calculator.domain.Classifier.model;

import java.time.LocalDate;

public class PersonImcData {

    double height;
    double weight;
    String name;
    char gender;
    LocalDate birthday;

    public PersonImcData(double height, double weight, String name, char gender, LocalDate birthday) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
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
}
