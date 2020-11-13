package com.github.sebyplays.yamlutilizer.yaml;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public abstract class YamlConfiguration implements YamlFunctions {

    private File file = null;
    private Map<String, Object> keyValMap = new HashMap<>();


    public YamlConfiguration() {
    }

    public YamlConfiguration(File filePath) throws IOException {
        this.file = filePath;
        this.file.createNewFile();

    }

    public void load() throws FileNotFoundException, YamlException {
        YamlReader yamlReader = new YamlReader(new FileReader(this.getFile()));
        this.keyValMap = (Map<String, Object>) yamlReader.read();

    }

    protected void setValue(String key, Object value) {
        this.keyValMap.put(key, value);
        return;
    }

    protected Object getValue(String key) throws FileNotFoundException {
        return this.keyValMap.get(key);
    }

    @Override
    public void save() throws IOException {
        YamlWriter yamlWriter = new YamlWriter(new FileWriter(this.getFile()));
        yamlWriter.write(this.keyValMap);
        yamlWriter.close();
    }

    @Override
    public void create() throws IOException {
        this.file.createNewFile();
    }

    public File getFile() {
        return file;
    }

    @Override
    public void setFile(File file) {
        this.file = file;
    }

}
