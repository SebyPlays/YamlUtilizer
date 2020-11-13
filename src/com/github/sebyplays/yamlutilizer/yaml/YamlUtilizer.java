package com.github.sebyplays.yamlutilizer.yaml;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class YamlUtilizer extends YamlConfiguration {

    public YamlUtilizer(String filePath) throws IOException {
        super(new File(filePath));
    }

    public YamlUtilizer() {
        super();
    }

    //Value Getters

    @Override
    public boolean getBoolean(String key) throws FileNotFoundException {
        return Boolean.parseBoolean(String.valueOf(getValue(key)));
    }

    @Override
    public String getString(String key) throws FileNotFoundException {
        return String.valueOf(getValue(key));
    }

    @Override
    public int getInt(String key) throws FileNotFoundException {
        return Integer.parseInt(String.valueOf(getValue(key)));
    }

    @Override
    public Integer getInteger(String key) throws FileNotFoundException {
        return Integer.parseInt(String.valueOf(getValue(key)));
    }

    @Override
    public long getLong(String key) throws FileNotFoundException {
        return Long.parseLong(String.valueOf(getValue(key)));
    }

    @Override
    public double getDouble(String key) throws FileNotFoundException {
        return Double.parseDouble(String.valueOf(getValue(key)));
    }

    //Value Setters

    @Override
    public void setBoolean(String key, boolean value) {
        setValue(key, value);
    }

    @Override
    public void setString(String key, String value) {
        setValue(key, value);
    }

    @Override
    public void setInt(String key, int value) {
        setValue(key, value);
    }

    @Override
    public void setLong(String key, long value) {
        setValue(key, value);
    }

    @Override
    public void setDouble(String key, double value) {
        setValue(key, value);
    }

}
