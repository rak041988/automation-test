package com.selenium.mavenit.page_object;

import com.selenium.mavenit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends DriverManager {

    public String getCurrentUrl(){
       return driver.getCurrentUrl();
    }

    public void doSearch(String item){
        driver.findElement(By.cssSelector("input[data-test='search-input']")).sendKeys(item);
        driver.findElement(By.cssSelector("input[data-test='search-input']")).sendKeys(Keys.ENTER);
    }
}
