package org.eldorado.calculator.infrastructure.database.fileDatabase;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

public abstract class FileDatabase<T> implements IFileDatabase<T> {

    FileWriter writer;
    protected FileReader reader;
    Logger LOGGER;
    public FileDatabase(File file){
        this.LOGGER = Logger.getLogger("PersonCreatorCli");
        try {
            writer = new FileWriter(file, true);
            reader = new FileReader(file);
        } catch (IOException e) {
            LOGGER.warning("Error while creating database file.");
        }
    }
    public void save(T data){
        try {
            BufferedWriter writer = new BufferedWriter(this.writer);
            writer.append(data.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            LOGGER.warning("Error while saving to file.");
        }
    }

    @Override
    public abstract T read();

    @Override
    public abstract List<T> readAll(File file);
}
