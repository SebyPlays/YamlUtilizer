# YamlUtilizer
The YamlUtilizer is a tool that simplifies the usage of the
snakeyaml-api supported by the yamlbeans-api.

The usage looks like the following:

YamlUtilizer yamlUtilizer = new YamlUtilizer(); //Create only the utilizer instance
YamlUtilizer yamlUtilizer = new YamlUtilizer(filePath).create; //Create the instance in addition to the file (No 'setFile()' needed) Corrosponds automatically to the given file;

yamlUtilizer.setFile(filePath); //Sets the file

yamlUtilizer.create(); //creates the file

yamlUtilizer.save(); //saves the file

yamlUtilizer.load(); //loads the key/value map

//Available Getters (Getting values from key/val map)
yamlUtilizer.getBoolean(key); 

yamlUtilizer.getString(key);

yamlUtilizer.getInteger(key);

yamlUtilizer.getInt(key);

yamlUtilizer.getLong(key);

yamlUtilizer.getDouble(key);

//Available Setters (Setting values to key/val map)
yamlUtilizer.setBoolean(key, value);

yamlUtilizer.setString(key, value);

yamlUtilizer.setInteger(key, value);

yamlUtilizer.setInt(key, value);

yamlUtilizer.setLong(key, value);

yamlUtilizer.setDouble(key, value);
