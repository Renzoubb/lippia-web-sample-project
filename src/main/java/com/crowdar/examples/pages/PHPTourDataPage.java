package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PHPTourDataPage extends PageBasePHP{
    //private final String CONTENTVERIFY_CSS= "body > div.body-inner > div.main-wrapper.scrollspy-action > div > div > div > div > div.acc_section > div > div.col-md-4.summary > aside > div.booking-selection-box";
   // private final String GUESS_BUTTON_ID= "#guesttab > span.hidden-xs";
    private final String FIRSTNAME_BUTTON_ID= "//*[@id=\"guestform\"]/div[1]/div[1]/div/label/input";
    private final String SECONDNAME_BUTTON_CSS= "#guestform > div.row.gap-20.mb-0 > div.col-md-6.col-12.o1 > label > input";
    private final String EMAIL_BUTTON_CSS= "#guestform > div:nth-child(2) > div.col-md-6.col-12.o2 > label > input[type=email]";
    private final String CONFIRMEMAIL_CSS= "#guestform > div:nth-child(2) > div.col-md-6.col-12.o1 > label > input[type=email]";
    private final String NUMBER_BUTTON_CSS= "#guestform > div:nth-child(3) > div > label > input[type=text]";
    private final String ADDRESS_BUTTON_CSS= "#guestform > div:nth-child(4) > div > label > input[type=text]";
    private final String COUNTRY_BUTTON_CSS= "#guestform > div:nth-child(5) > div > div.chosen-container.chosen-container-single.chosen-container-active > a";
    private final String EDITCOUNTRY_CSS= "#guestform > div:nth-child(5) > div > div.chosen-container.chosen-container-single > div > div > input";
    private final String COUNTRYNAME_CSS= "#guestform > div:nth-child(5) > div > div.chosen-container.chosen-container-single.chosen-container-active.chosen-with-drop > div > ul > li:nth-child(6)";

    public PHPTourDataPage(RemoteWebDriver driver) {
        super(driver);
    }


    /*public void VerifyDataPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(CONTENTVERIFY_CSS)));
        System.out.println("llegaste a la pagina");

        //Assert.assertTrue(isPresent("PHPHome.content"), "El elemento no está cargado o visible");
    }*/
    public void clickFirst(){clickElement(By.name(FIRSTNAME_BUTTON_ID));}



   /* public void clickFirstName(){clickElement(By.xpath(FIRSTNAME_BUTTON_XPATH));}
    public void CompleteFirstName(){completeField(By.xpath(FIRSTNAME_BUTTON_XPATH), "Renzo");}*/
    public void clickSecondName(){clickElement(By.cssSelector(SECONDNAME_BUTTON_CSS));}
    public void CompleteSecondName(){completeField(By.cssSelector(SECONDNAME_BUTTON_CSS), "Ubeira");}
    public void clickEmail(){clickElement(By.cssSelector(EMAIL_BUTTON_CSS));}
    public void CompleteEmail(){completeField(By.cssSelector(EMAIL_BUTTON_CSS), "renzo.ubeira@gmail.com");}
    public void clickConfirmEmail(){clickElement(By.cssSelector(CONFIRMEMAIL_CSS));}
    public void CompleteConfirmEmail(){completeField(By.cssSelector(CONFIRMEMAIL_CSS), "renzo.ubeira@gmail.com");}
    public void clickPhone(){clickElement(By.cssSelector(NUMBER_BUTTON_CSS));}
    public void CompletePhone(){completeField(By.cssSelector(NUMBER_BUTTON_CSS), "2613002251");}
    public void clickAddress(){clickElement(By.cssSelector(ADDRESS_BUTTON_CSS));}
    public void CompleteAddress(){completeField(By.cssSelector(ADDRESS_BUTTON_CSS), "Sarmiento 80");}
    public void clickCountryButton(){clickElement(By.cssSelector(COUNTRY_BUTTON_CSS));}
    public void clickCountrySelected(){clickElement(By.cssSelector(COUNTRYNAME_CSS));}

}
