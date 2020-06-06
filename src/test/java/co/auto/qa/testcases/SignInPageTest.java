package co.auto.qa.testcases;

import com.auto.qa.base.TestBase;
import com.auto.qa.pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {
    SignInPage signInPage;

    SignInPageTest() {

        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();

        signInPage = new SignInPage();

    }

    @Test
    public void SignInPageTitleTest() {
        String title = signInPage.validateSignInPageTitle();
        Assert.assertEquals(title, "My Store");

    }
}
