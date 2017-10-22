
package com.kabo.core.ui;

public class WebDriverUtility extends AbstractDriver{


    private WebDriverUtility(){
        super();
    }

    public static WebDriverUtility webDriverUtility=new WebDriverUtility();

    public static WebDriverUtility getWebDriverUtility(){

        return webDriverUtility;
    }


}
