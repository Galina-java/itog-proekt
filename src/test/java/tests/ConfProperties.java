package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {

    protected static FileInputStream fileInputStream;
    static Properties PROPERTIES;

    static {
        try {
            fileInputStream = new FileInputStream ("src/main/resources/conf.properties");
            setPROPERTIES(new Properties());
            getPROPERTIES().load(fileInputStream);

        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (fileInputStream != null)
                try {

                    fileInputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
        }

    }
    public static String getProperty(String key) {return getPROPERTIES().getProperty(key);}

    static Properties getPROPERTIES() {
        return PROPERTIES;
    }

    static void setPROPERTIES(Properties PROPERTIES) {
        ConfProperties.PROPERTIES = PROPERTIES;
    }
}
