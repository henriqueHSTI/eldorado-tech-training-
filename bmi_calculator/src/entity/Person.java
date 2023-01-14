package entity;

public class Person {

    String name;
    double height;
    double weight;
    char gender;
    int age;
    String bmi;

    public Person(String name, double height, double weight, char gender, int age, String bmi) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.bmi = bmi;
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

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                ", age=" + age +
                ", bmi='" + bmi + '\'' +
                '}';
    }

    public String toJson() {
        String json = "{";
        json += "\"name\":\"" + name + "\",";
        json += "\"height\":" + height + ",";
        json += "\"weight\":" + weight + ",";
        json += "\"gender\":\"" + gender + "\",";
        json += "\"age\":" + age + ",";
        json += "\"bmi\":\"" + bmi + "\"";
        json += "}";
        return json;
    }

    public String toCSV() {
        return name + "," + height + "," + weight + "," + gender + "," + age + "," + bmi;
    }
}
