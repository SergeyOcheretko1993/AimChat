package project.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    public static String getPropertyFilePath() {
        String propertyFilePath = null;
        switch (System.getProperty("os.name")) {
            case "Linux":
                propertyFilePath = "/src/test/resources/properties/";
                break;
            case "Windows 10":
                propertyFilePath = "\\src\\test\\resources\\properties\\";
                break;
        }
        return propertyFilePath;
    }

    private static PropertyManager instance;
    private static final Object lock = new Object();
        private static final String propertyFilePath = System.getProperty("user.dir") + getPropertyFilePath() + "env.properties";

    private static String url;
    private static String url2;

    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        PropertyManager.url = url;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        PropertyManager.url2 = url2;
    }



    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();

        //Read configuration.properties file
        try {
            prop.load(new FileInputStream(propertyFilePath));
            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }

        //Get properties from configuration.properties
        url = prop.getProperty("url");

        url2 = prop.getProperty("url2");
    }

}
