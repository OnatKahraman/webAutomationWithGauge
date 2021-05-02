package model;

import driver.Driver;

public class homeModel extends Driver {
    public void goToUrl (){
        webDriver.get("http://thedemosite.co.uk/login.php");

    }

}
