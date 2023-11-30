package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigHelper {

    private Properties prop;
    public Properties init_prop() throws FileNotFoundException {
        prop = new Properties();
        try {
            FileInputStream inFile = new FileInputStream("/Users/alexyeung/Source/homeaglow_fe/src/test/resources/config/config.properties");
            prop.load(inFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }


}
