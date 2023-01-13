package br.org.eldorado.calculoimc.utils;
import br.org.eldorado.calculoimc.model.Person;

public class Imc {

    public double calculate(Person person) {
        return person.getWeight() / (person.getHeight() * person.getHeight());
    }

    public String info (Person person, double imc) {
        return String.format("Nome: %s, IMC: %s", person.getName(), imc);
    }

}
