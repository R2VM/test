package com.auto.qa.pages;

import com.auto.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends TestBase {
    @FindBy(name="email")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
    WebElement signBt;

    public SignInPage() {
        PageFactory.initElements(driver,this);

    }
    public String validateSignInPageTitle() {
        return driver.getTitle();

    }
}
