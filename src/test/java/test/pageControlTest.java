package test;

import com.thoughtworks.gauge.Step;
import model.pageControlModel;
import org.junit.Assert;

public class pageControlTest {
    pageControlModel model = new pageControlModel();

    @Step("Check title login page")
    public void checkTitle(){
        Assert.assertEquals("Login example page to test the PHP MySQL online system", model.checkTitle());
    }

    @Step("Check Header on login page")
    public void checkHeader(){
        Assert.assertEquals("4. Login",model.checkHeader());
    }

    @Step("Check Status Message on login page")
    public void checkStatusMessage(){
        Assert.assertEquals("**No login attempted**",model.checkStatusMessage());
    }

    @Step("Check Info Message on login page")
    public void checkInfoMessage(){
        Assert.assertEquals("Enter your login details you added on the previous page and test the login.\n" +
                "The success or failure will be shown above.",model.checkInfoMessage());
    }
    @Step("Check User name on login page")
    public void checkUserNameField(){
        Assert.assertTrue(model.checkUserNameField());
    }
    @Step("Check password field on login page")
    public void checkPasswordField(){
        Assert.assertTrue(model.checkPasswordField());
    }
    @Step("Check Login button")
    public void checkLoginButton(){
        Assert.assertTrue(model.checkLoginButton());
    }
}
