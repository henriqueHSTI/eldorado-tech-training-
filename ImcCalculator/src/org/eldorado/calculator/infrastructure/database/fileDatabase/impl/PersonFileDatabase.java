package org.eldorado.calculator.infrastructure.database.fileDatabase.impl;

import org.eldorado.calculator.domain.Classifier.model.Person;
import org.eldorado.calculator.infrastructure.database.fileDatabase.FileDatabase;

import java.io.BufferedReader;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonFileDatabase extends FileDatabase<Person> {

    public PersonFileDatabase(File file) {
        super(file);
    }

    @Override
    public Person read() {
        return null;
    }

    @Override
    public List<Person> readAll(File file) {
        BufferedReader reader = new BufferedReader(this.reader);
        Stream<String> dataAsString = reader.lines();

        var list = new ArrayList<Person>();
        dataAsString.forEach(data -> {
            var person = parseStringToObject(data);
            list.add(person);
        });

        return list;
    }

    private Person parseStringToObject(String data) {
        Map<String, String> properties = new HashMap<>();

        var valuesAsArray = data.replace(" ","").replace("{","").replace("}","").split(",");
        var props = Arrays.stream(valuesAsArray).collect(Collectors.toList());
        props.forEach(prop -> {
            var key = prop.split("=")[0];
            var value = prop.split("=")[1];
            properties.put(key, value);
        });
        System.gc();
        return new Person(
                properties.get("height"),
                properties.get("weight"),
                properties.get("name"),
                properties.get("gender"),
                properties.get("birthday")
        );
    }

}
