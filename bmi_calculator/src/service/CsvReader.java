package service;

import entity.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvReader {

//    public static List<Person> readCsv(String filePath) {
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] values = line.split(",");
//                String name = values[0];
//                double height = Double.parseDouble(values[1]);
//                double weight = Double.parseDouble(values[2]);
//                char gender = values[3].charAt(0);
//                int age = Integer.parseInt(values[4]);
//                String bmi = values[5];
//                System.out.println("Name: " + name);
//                System.out.println("Height: " + height);
//                System.out.println("Weight: " + weight);
//                System.out.println("Gender: " + gender);
//                System.out.println("Age: " + age);
//                System.out.println("BMI: " + bmi);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}