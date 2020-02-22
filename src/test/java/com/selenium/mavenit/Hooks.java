package com.selenium.mavenit;

import com.selenium.mavenit.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverManager driverManager= new DriverManager();
    @Before
    public void setUp(){
        driverManager.openBrowser();
        driverManager.maxBrowser();
        driverManager.navigateTo("https://www.argos.co.uk/");
        driverManager.applyImpcitWait();
    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
