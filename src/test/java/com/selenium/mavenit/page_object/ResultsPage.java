package com.selenium.mavenit.page_object;

import com.selenium.mavenit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriverManager {

    public void selectFilter(String filterOption) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(".findability-facet__rating-label"), 5));

        List<WebElement> reviewElemets = driver.findElements(By.cssSelector(".findability-facet__rating-label"));

        for (WebElement review : reviewElemets) {
            String availableFilter = review.getText();

            if (availableFilter.equalsIgnoreCase(filterOption)) {
                review.click();
                break;
            }
        }
    }


    public List<Double> getProductRating() {
        // TODO: 2020-02-22 change this to webdriver wait
        sleep(3000);
        List<Double> ratingList = new ArrayList<>();

        List<WebElement> ratingElemets = driver.findElements(By.cssSelector("div[data-test='component-ratings']"));
        for (WebElement rating : ratingElemets) {
            String ratingInString = rating.getAttribute("data-star-rating");
            double ratingInDouble = Double.parseDouble(ratingInString);
            ratingList.add(ratingInDouble);
        }
        return ratingList;
    }
}
