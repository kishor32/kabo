package com.kabo.core.ui;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public abstract class Options {


    public abstract ChromeOptions chromeOption();
    public abstract FirefoxOptions fireOptions();
    public abstract FirefoxProfile firefoxProfile();
}
