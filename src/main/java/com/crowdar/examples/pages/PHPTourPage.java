package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PHPTourPage extends PageBasePHP{
    private final String ADULT_BUTTON_CSS="#selectedAdults";
    private final String QUANTITYADULT_CSS= "#selectedAdults > option:nth-child(2)";
    private final String CHILD_BUTTON_CSS= "#selectedChild";
    private final String QUANTITYCHILD_CSS= "#selectedChild > option:nth-child(3)";
    private final String SEARCH_BUTTON_CSS= "body > div.body-inner > div > div > div.page-wrapper.page-detail.bg-light > div:nth-child(5) > div > div.col-12.col-lg-4.col-xl-3.order-lg-last > aside > div > form > div > form > button";

    public PHPTourPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickAdult(){ clickElement(By.cssSelector(ADULT_BUTTON_CSS)); }
    public void clickQuantityAdult(){By.cssSelector(QUANTITYADULT_CSS);}
    public void clickChild(){By.cssSelector(CHILD_BUTTON_CSS);}
    public void clickQuantityChild(){By.cssSelector(QUANTITYCHILD_CSS);}
    public void clickSearch(){By.cssSelector(SEARCH_BUTTON_CSS);}

}
