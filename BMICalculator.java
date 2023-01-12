public class BMICalculator {
    public static void main(String[] args) {
        double weight = 80.5;
        double height = 1.75;
        double imc = weight / (height * height);
        System.out.println("Your IMC is: " + imc);
        String healthStatus = classifyBMI(imc);
        System.out.println("Seu status de saúde é: " + healthStatus);
    }

    public static String classifyBMI(double imc) {
        if (imc < 18.5) {
            return "Magro";
        } else if (imc >= 18.5 && imc < 25) {
            return "Saudável";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }
}