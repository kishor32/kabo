package com.kabo.core.ui;

import com.kabo.core.utility.Utility;
import org.openqa.selenium.WebDriver;

public abstract class AbstractDriver {


    protected AbstractDriver(){


    }

    private WebDriver driver=null;
    private final String BROWSER= Utility.getValueFromPropertyFile("BROWSER").toLowerCase();
    private final String PATH_TO_DRIVER=Utility.getValueFromPropertyFile("PATH_TO_DRIVER").toLowerCase();

    private void setSystemProperties(){

        if(BROWSER.contains("chrome")){

            System.setProperty("webdriver.chrome.driver",PATH_TO_DRIVER);
            return;
        }else if(BROWSER.contains("firefox") || BROWSER.toLowerCase().contains("mozilla")){

            System.setProperty("webdriver.gecko.driver", PATH_TO_DRIVER);
            return;
        }else if(BROWSER.contains("IE")|| BROWSER.contains("internet")){

            System.setProperty("webdriver.ie.driver", PATH_TO_DRIVER);
            return;
        }else if(BROWSER.contains("edge")){
            System.setProperty("webdriver.edge.driver", PATH_TO_DRIVER);
            return;
        }else if(BROWSER.contains("safari")){
            System.setProperty("webdriver.safari.driver", PATH_TO_DRIVER);
        }else if(BROWSER.contains("opera")){
            System.setProperty("webdriver.opera.driver", PATH_TO_DRIVER);
            return;
        }
    }
}