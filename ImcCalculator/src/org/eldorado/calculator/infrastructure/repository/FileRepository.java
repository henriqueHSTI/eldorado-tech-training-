package org.eldorado.calculator.infrastructure.repository;

import org.eldorado.calculator.infrastructure.database.fileDatabase.IFileDatabase;

import java.io.File;
import java.util.List;

public abstract class FileRepository<T> implements IFileRepository<T>{

    protected IFileDatabase database;
    public FileRepository(IFileDatabase database){
        this.database = database;
    }

    @Override
    public void save(T data) {
        this.database.save(data);
    }

    @Override
    public abstract T read();

    @Override
    public abstract List<T> readAll(File file);
}
