package org.eldorado.calculator.infrastructure.repository;

import java.io.File;
import java.util.List;
public interface IFileRepository<T> {
    void save(T data);
    T read();
    List<T> readAll(File file);
}

