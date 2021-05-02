package model;

import driver.Driver;
import org.openqa.selenium.By;

public class pageControlModel extends Driver {
    public By chkHeader= By.xpath("/html/body/table/tbody/tr/td[1]/p[1]/big/strong");
    public By chkStatusMessage= By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b");
    public By chkInfoMessage= By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote/p");
    public By chkUserNameField= By.name("username");
    public By chkUserPasswordField= By.name("password");
    public By chkLoginButton = By.name("FormsButton2");

    public String checkTitle(){
        return webDriver.getTitle();
    }
    public String checkHeader(){
        return webDriver.findElement(chkHeader).getText();
    }
    public String checkStatusMessage(){
        return webDriver.findElement(chkStatusMessage).getText();
    }
    public String checkInfoMessage(){
        return webDriver.findElement(chkInfoMessage).getText();
    }
    public boolean checkUserNameField(){
        return webDriver.findElement(chkUserNameField).isDisplayed();
    }
    public boolean checkPasswordField(){
        return webDriver.findElement(chkUserPasswordField).isDisplayed();
    }
    public boolean checkLoginButton(){
        return webDriver.findElement(chkLoginButton).isDisplayed();
    }
}
