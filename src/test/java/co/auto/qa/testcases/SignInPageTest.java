package co.auto.qa.testcases;

import com.auto.qa.base.TestBase;
import com.auto.qa.pages.SignInPage;
import org.testng.annotations.BeforeMethod;

public class SignInPageTest extends TestBase {
    SignInPage signInPage;

    SignInPageTest(){

        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();

        signInPage = new SignInPage();

    }

}
