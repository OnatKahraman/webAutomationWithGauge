package test;
import static driver.Driver.webDriver;

import com.thoughtworks.gauge.Step;
import model.homeModel;
import org.junit.Assert;

public class homeTest {
    homeModel model = new homeModel();

    @Step("Go to the demo site login page")
    public void goToUrl (){
        model.goToUrl();
        Assert.assertEquals("http://thedemosite.co.uk/login.php", webDriver.getCurrentUrl());
    }
}
