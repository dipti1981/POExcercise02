package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Utils extends BasePage{
    public static void clickOnTheElement(By by){
        driver.findElement(by).click();
    }
    public static void typeTheText(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();}
   // public static String getTextFromElements(By by){
      //  return driver.findElements(by).get.Text();
  //  }
   public static void selectElementByText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

   }
   public static void selectElementByValue(By by,String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
   }
   public static void selectElementByIndex(By by, int index) {
       Select select = new Select(driver.findElement(by));
       select.selectByIndex(index);
   }
    public long timestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    public static void explicitWaitClick(By by){
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
       wait.until(ExpectedConditions.elementToBeClickable(by));

    }

    public static void explicitWaitInvisible(By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    public static void waitForElementToBeVisible(By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }
    public static void waitVisibilityOfAllElementsLocated (By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));

    }
    public static void listMethod(By by){
        List<WebElement> input = driver.findElements(by);
        for (WebElement e : input) {
            System.out.println(e.getText());
        }
    }


}


