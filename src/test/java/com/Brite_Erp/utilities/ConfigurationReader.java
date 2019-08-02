package com.Brite_Erp.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    //

    private static Properties configFile;
    static {
        try {
            //path to .properties file
            String path = "D:/Ozlem Java Projects/Brite_ErpAutomationSpring2019/configuration.properties";
            //create object of inputs stream to access file
            FileInputStream input = new FileInputStream(path);
            //initialize config file
            configFile = new Properties();
            //load properties file
            configFile.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        return configFile.getProperty(key);
    }


}
