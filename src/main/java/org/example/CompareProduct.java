package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProduct extends Utils{
    private By _productName1 = By.xpath("//div[@class=\"table-wrapper\"]/table/tbody/tr[3]/td[2]/a");
    private By _productName2 = By.xpath("//div[@class=\"table-wrapper\"]/table/tbody/tr[3]/td[3]/a");
    private By _clickOnClearList = By.xpath("//div[@class =\"page-body\"]/a");
    private By _actualMessage = By.className("no-data");
    String expectedMessage = "have no items to compare";
    public void verifyProductComparison(){
        //capture the first product name
        String productName1 = getTextFromElement(_productName1);
        System.out.println("Product name1 is: " + productName1);
        // capture the second product name
        String productName2 = getTextFromElement(_productName2);
        System.out.println("Product name 2 is: " + productName2);
        //click on clear list button
         clickOnTheElement(_clickOnClearList);
        // capture the message when no product in compare
        String actualMessage = getTextFromElement(_actualMessage);
        //Assert to verify the actual message and expected message
        Assert.assertEquals(actualMessage, expectedMessage, "User cant see any product to compare");

    }
}
