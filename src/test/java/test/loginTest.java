package test;


import com.thoughtworks.gauge.Step;
import model.loginModel;
import model.pageControlModel;
import org.junit.Assert;

public class loginTest {
    loginModel model = new loginModel();
    pageControlModel pageModel = new pageControlModel();

    @Step("Enter correct username on login page")
    public void setUserName(){
        model.setUserName();
    }

    @Step("Enter correct password on login page")
    public void setPassword(){
        model.setPassword();
    }
    @Step("Click login button on login page")
    public void clickLoginButton(){
        model.clickLoginButton();
    }
    @Step("Check success login status message on login page")
    public void checkLoginStatusMessage(){
        Assert.assertEquals("**Successful Login**",pageModel.checkStatusMessage());
    }

    @Step("Enter incorrect username on login page")
    public void setFailUserName(){
        model.setFailUserName();
    }

    @Step("Enter incorrect password on login page")
    public void setFailPassword() {
        model.setFailPassword();
    }

    @Step("Check failed login status message on login page")
    public void checkFailedLoginStatusMessage(){
        Assert.assertEquals("**Failed Login**",pageModel.checkStatusMessage());
    }
}
