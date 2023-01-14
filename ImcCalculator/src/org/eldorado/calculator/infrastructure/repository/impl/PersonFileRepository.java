package org.eldorado.calculator.infrastructure.repository.impl;

import org.eldorado.calculator.infrastructure.database.fileDatabase.IFileDatabase;
import org.eldorado.calculator.infrastructure.repository.FileRepository;

import java.io.File;
import java.util.List;

public class PersonFileRepository extends FileRepository {

    public PersonFileRepository(IFileDatabase database) {
        super(database);
    }

    @Override
    public Object read() {
        return null;
    }

    @Override
    public List readAll(File file) {
        return this.database.readAll(file);
    }

}
