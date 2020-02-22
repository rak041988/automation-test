package com.selenium.mavenit.page_object;

import com.selenium.mavenit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(css = "input[data-test='search-input']")
    private WebElement searchBox;

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void doSearch(String item) {
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.ENTER);

    }
}
