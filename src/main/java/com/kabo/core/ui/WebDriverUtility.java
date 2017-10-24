
package com.kabo.core.ui;

import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverUtility extends AbstractDriver{

    private WebDriverUtility(){
        super();
    }

    private static WebDriverUtility webDriverUtility;

    public static WebDriverUtility getWebDriverUtility(){
        return webDriverUtility;
    }


    @Override
    public DesiredCapabilities setCapabilities(DesiredCapabilities capabilities) {
        return null;
    }
}
