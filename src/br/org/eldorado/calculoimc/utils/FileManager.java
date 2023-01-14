package br.org.eldorado.calculoimc.utils;
import br.org.eldorado.calculoimc.Main;
import br.org.eldorado.calculoimc.model.Person;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FileManager {

    private static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public void createFile(final List<Person> people) {
        try {
            FileWriter file = new FileWriter("people.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(file);

            for (Person person: people) {
                bufferedWriter.append(person.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    public List<Person> readFile(String fileName) {
        try {
            List<Person> people = new ArrayList<>();
            FileReader file = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(file);
            String line = bufferedReader.readLine();

            while (line != null) {
                String lineArray[] = line.split(";");
                Person person = new Person();
                person.setName(lineArray[0]);
                person.setAge(Integer.valueOf(lineArray[1]));
                person.setGender(lineArray[2].charAt(0));
                person.setHeight(Double.valueOf(lineArray[3]));
                person.setWeight(Double.valueOf(lineArray[4]));
                person.setImc(Double.valueOf(lineArray[5]));
                people.add(person);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            return people;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Person> filterByGender(char gender) {
        List<Person> registeredPeople = this.readFile("people.txt");
        return registeredPeople.stream().filter(person -> Objects.equals(person.getGender(), gender)).collect(Collectors.toList());
    }
}


