package com.auto.qa.pages;

import com.auto.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends TestBase {
    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
    WebElement contactus;

    @FindBy(xpath = "//*[@id=\"id_contact\"]")
    WebElement heading;

    @FindBy(xpath = "//*[@id=\"id_contact\"]")
    WebElement customerService;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"id_order\"]")
    WebElement orderRef;

    @FindBy(xpath = "//*[@id=\"fileUpload\"]")
    WebElement attachFile;

    @FindBy(xpath = "//*[@id=\"message\"]")
    WebElement message;

    @FindBy(xpath = "//*[@id=\"submitMessage\"]/span")
    WebElement send;

    public ContactUsPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateContactUsPageTitle() {
        return driver.getTitle();}
    public void subjectHandling(){
        heading.click();
    }
    public void subjectHandling1(){
        customerService.submit();
    }
    public  void email1(){
        email.sendKeys("test@gmail.com");
    }
    public void orderRef() {
        orderRef.sendKeys("KK123");
    }
    public void message(){
        message.sendKeys("Customer Details Sent");
    }
}

