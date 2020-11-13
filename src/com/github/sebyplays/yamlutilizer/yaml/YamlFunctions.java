package com.github.sebyplays.yamlutilizer.yaml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface YamlFunctions {

    boolean getBoolean(String key) throws FileNotFoundException;

    String getString(String key) throws FileNotFoundException;

    int getInt(String key) throws FileNotFoundException;

    Integer getInteger(String key) throws FileNotFoundException;

    long getLong(String key) throws FileNotFoundException;

    double getDouble(String key) throws FileNotFoundException;

    void setBoolean(String key, boolean value);

    void setString(String key, String value);

    void setInt(String key, int value);

    void setLong(String key, long value);

    void setDouble(String key, double value);

    void save() throws IOException;

    void create() throws IOException;

    File getFile();

    void setFile(File file);
}
