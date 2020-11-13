# YamlUtilizer
The YamlUtilizer is a tool that simplifies the usage of the
snakeyaml-api supported by the yamlbeans-api.

The usage looks like the following:

YamlUtilizer yamlUtilizer = new YamlUtilizer();
YamlUtilizer yamlUtilizer = new YamlUtilizer(filePath).create;

yamlUtilizer.setFile(filePath);

yamlUtilizer.create();

yamlUtilizer.save();

yamlUtilizer.load();

yamlUtilizer.getBoolean(key);
yamlUtilizer.getString(key);
yamlUtilizer.getInteger(key);
yamlUtilizer.getInt(key);
yamlUtilizer.getLong(key);
yamlUtilizer.getDouble(key);

yamlUtilizer.setBoolean(key, value);
yamlUtilizer.setString(key, value);
yamlUtilizer.setInteger(key, value);
yamlUtilizer.setInt(key, value);
yamlUtilizer.setLong(key, value);
yamlUtilizer.setDouble(key, value);
