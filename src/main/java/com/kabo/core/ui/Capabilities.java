package com.kabo.core.ui;

import org.openqa.selenium.remote.DesiredCapabilities;

class Capabilities {
    private Capabilities(){

    }
    private static DesiredCapabilities capabilities=new DesiredCapabilities();
    private static Capabilities capabilities1=new Capabilities();

    public static Capabilities getCapabilityInstance(){
        if(capabilities1==null){
            return capabilities1;
        }
        return null;
    }
    public void setCapability(String key, String value){
        capabilities.setCapability(key, value);
    }
    public DesiredCapabilities getCapabilities( ) {
        return capabilities;

    }
}
