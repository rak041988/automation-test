package com.selenium.mavenit.page_object;

import com.selenium.mavenit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ResultsPage extends DriverManager {

    public void selectFilter(String filterOption) {
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(".findability-facet__rating-label"),5));

        List<WebElement> reviewElemets = driver.findElements(By.cssSelector(".findability-facet__rating-label"));

        for (WebElement review : reviewElemets) {
            String availableFilter = review.getText();

            if (availableFilter.equalsIgnoreCase(filterOption)) {
                review.click();
                break;
            }
        }
    }
}
