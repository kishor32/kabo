package com.kabo.core.utility;

import com.kabo.core.exception.KaboException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility {


    private Utility(){

    }


    private static InputStream ins;
    private static Properties properties;

    static {

        try {
            ins=new FileInputStream("kabo.properties");
            if(!isNull(ins)){
                properties=new Properties();
                if(!isNull(properties)){
                    properties.load(ins);
                }
            }
        }catch (Exception kabo){
            throw new KaboException("You need to set kabo.properties in your project root folder--"+kabo.getMessage());
        }finally {
            try {
                ins.close();
            } catch (IOException e) {
                throw new KaboException("Error closing the file"+e.getMessage());
            }
        }
    }


    public static String getValueFromPropertyFile(String key){
        if(!isNull(key) && !key.isEmpty() && !key.equals("")) {
            for(String k:properties.stringPropertyNames()){
                if(!k.equals("BROWSER") && !k.equals("PLATFORM") && !k.equals("PROCESSOR") && !k.equals("PATH_TO_DRIVER")){
                    throw new KaboException("opps!! Do not temper with system variables BROWSER, PLATFORM and PROCESSOR in kabo.properties");
                }
            }
            return properties.getProperty(key);
        }
        throw new KaboException("opps!! Please provide a valid key");
    }

    /**
     *
     * @param o
     * @return
     */
    public static boolean isNull(Object o){
        if(o==null){
            throw new KaboException("Null pointer detected.Have you forget it to Initialize ? ");
        }
        return false;
    }
}
