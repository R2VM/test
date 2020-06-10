package com.auto.qa.pages;

import com.auto.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends TestBase {
    @FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signIn;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElement password;

    @FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
    WebElement signButton;                     //submit button



    //@FindBy(xpath ="//*[@id=\"SubmitCreate\"]/span")
    //WebElement signBtn;

    //@FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    //WebElement logoImg;

    //@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    //WebElement signinBtn;                         // Sign In button

    public SignInPage() {
        PageFactory.initElements(driver,this);

    }
    public String validateSignInPageTitle() {

        return driver.getTitle();
            }
     public void setSignin(String un,String pwd) {
        signIn.click();
        username.sendKeys(un);
        password.sendKeys(pwd);
        signButton.click();
        //signIn.click();
        //signBtn.click();
     }
}
