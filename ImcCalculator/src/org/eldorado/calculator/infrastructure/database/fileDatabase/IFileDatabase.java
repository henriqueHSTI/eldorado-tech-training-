package org.eldorado.calculator.infrastructure.database.fileDatabase;

import java.io.File;
import java.util.List;

public interface IFileDatabase<T> {
    void save(T data);
    T read();
    List<T> readAll(File file);
}
