package model;


import driver.Driver;
import org.openqa.selenium.By;


public class loginModel extends Driver {
    public By txtUserNameField= By.name("username");
    public By txtUserPasswordField= By.name("password");
    public By btnLoginButton = By.name("FormsButton2");

    public void setUserName(){
        webDriver.findElement(txtUserNameField).sendKeys("test123");
    }

    public void setPassword(){
        webDriver.findElement(txtUserPasswordField).sendKeys("test123");
    }
    public void clickLoginButton(){
        webDriver.findElement(btnLoginButton).click();
    }
    public void setFailUserName(){
        webDriver.findElement(txtUserNameField).sendKeys("test12223");
    }

    public void setFailPassword(){
        webDriver.findElement(txtUserPasswordField).sendKeys("test12e3");
    }

}
