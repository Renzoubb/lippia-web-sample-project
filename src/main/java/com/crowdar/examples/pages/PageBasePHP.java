package com.crowdar.examples.pages;

import com.crowdar.core.Injector;
import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBasePHP extends PageBaseWeb {

    public PageBasePHP(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "https://www.phptravels.net/";
    }


}
