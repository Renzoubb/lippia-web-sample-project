package com.crowdar.examples.pages;

import com.crowdar.core.Injector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class PHPHomePage extends PageBasePHP {
    /*private final String INPUT_SEARCH_XPATH = "//input[@class='gLFyf gsfi']";
    private final String SEARCH_BUTTON_NAME = "btnK";*/
    private final String TOURS_BUTTON_CSSELECTOR= "#search > div > div > div > div > div > nav > ul > li:nth-child(5) > a";
    private final String PAGE_CONTENT_CSSELECTOR="#search > div";
    private final String TOUR_CSSELECTOR= "body > div.body-inner > div.main-wrapper.scrollspy-action > div:nth-child(6) > div > div.row.equal-height.cols-2.cols-md-2.cols-lg-4.gap-10.gap-md-20.gap-xl-30 > div:nth-child(1) > figure";


    public PHPHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }
    public void go() {
        navigateToCompleteURL();
    }

    public void VerifyPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(PAGE_CONTENT_CSSELECTOR)));
        //Assert.assertTrue(isPresent("PHPHome.content"), "El elemento no está cargado o visible");
    }

    public void clickTour(){
        clickElement(By.cssSelector(TOUR_CSSELECTOR));
    }

    public void clickTourv2() {
        List<WebElement> listaTours = getElements("PHPHome.tabla");
        int numero = (int) (Math.random() * listaTours.size());
        for (WebElement tour:listaTours){

        }
    }
   /* public void enterSearchCriteria(String text) {
        completeField(By.xpath(INPUT_SEARCH_XPATH), text);
    }

    public void clickSearchButton() {
        clickElement(By.name(SEARCH_BUTTON_NAME));
    }*/

}
