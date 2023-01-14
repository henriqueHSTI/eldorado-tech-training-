import com.eldorado.calculo.model.Person;
import com.eldorado.calculo.utilities.ImcUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("imc.txt"));
        var calculaImcFerramenta = new ImcUtils();

        var pessoas = new ArrayList<Person>();

        boolean continuar = true;
        while(continuar) {

            var person = new Person();

            System.out.println("Digite seu nome");
            person.setName(scanner.nextLine());

            System.out.println("Digite sua altura");
            person.setHeight(lerValorDoubleUsuario(scanner));

            System.out.println("Digite seu peso");
            person.setWeight(lerValorDoubleUsuario(scanner));

            System.out.println("Digite sua idade");
            person.setAge(lerValorIntegerUsuario(scanner));

            double imc = calculaImcFerramenta.calculaImc(person);
            person.setImc(imc);

            LOGGER.log(Level.INFO, person.toString());

            pessoas.add(person);

            LOGGER.info(calculaImcFerramenta.printInformacao(imc));

            LOGGER.info(calculaImcFerramenta.retornaNivelObesidade("INFO"));

            System.out.println("Digite C continuar e S para sair");
            String line = scanner.nextLine().toUpperCase();

            continuar = Objects.equals("C", line);
        }

        for (Person person: pessoas) {
            writer.append(person + "\n");
        }

        writer.flush();

        scanner.close();
        writer.close();
    }

    private static Integer lerValorIntegerUsuario(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto => %s", scanner.nextLine()));
        }

        return Integer.MIN_VALUE;
    }

    private static Double lerValorDoubleUsuario(Scanner scanner) {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor digitado incorreto => %s", scanner.nextLine()));
        }

        scanner.nextLine();
        return Double.MIN_NORMAL;
    }
}