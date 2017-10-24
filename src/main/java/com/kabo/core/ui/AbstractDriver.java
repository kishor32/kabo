package com.kabo.core.ui;

import com.kabo.core.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public abstract class AbstractDriver {

    private WebDriver driver = null;
    private final String BROWSER = Utility.getValueFromPropertyFile("BROWSER").toLowerCase();
    private final String PATH_TO_DRIVER = Utility.getValueFromPropertyFile("PATH_TO_DRIVER").toLowerCase();

    private AbstractDriver setDriver( ) {
        if (BROWSER.contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", PATH_TO_DRIVER);
            driver = new ChromeDriver();
        } else if (BROWSER.contains("firefox") || BROWSER.toLowerCase().contains("mozilla")) {
            System.setProperty("webdriver.gecko.driver", PATH_TO_DRIVER);
            driver = new FirefoxDriver();
        } else if (BROWSER.contains("IE") || BROWSER.contains("internet")) {
            System.setProperty("webdriver.ie.driver", PATH_TO_DRIVER);
            driver = new InternetExplorerDriver();
        } else if (BROWSER.contains("edge")) {
            System.setProperty("webdriver.edge.driver", PATH_TO_DRIVER);
            driver = new EdgeDriver();
        } else if (BROWSER.contains("safari")) {
            System.setProperty("webdriver.safari.driver", PATH_TO_DRIVER);
            driver = new SafariDriver();
        } else if (BROWSER.contains("opera")) {
            System.setProperty("webdriver.opera.driver", PATH_TO_DRIVER);
            driver = new OperaDriver();
        }
        return this;
    }

    public abstract DesiredCapabilities setCapabilities(DesiredCapabilities capabilities );


    private  void capbility(){
        DesiredCapabilities capabilities=new DesiredCapabilities();
    }
}
