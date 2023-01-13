package entity;

public class Person {

    double height;
    double weight;
    String name;
    char gender;
    int age;

    public Person(double height, double weight, String name, char gender, short age) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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
                "height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
