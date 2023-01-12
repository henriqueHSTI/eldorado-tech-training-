import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Your height in meters (m,cm): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight.");
        } else if (bmi < 25) {
            System.out.println("Normal.");
        } else if (bmi < 30) {
            System.out.println("Overweight.");
        } else if (bmi < 40) {
            System.out.println("Obese.");
        } else {
            System.out.println("Morbid obesity.");
        }
    }
}