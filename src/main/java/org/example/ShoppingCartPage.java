package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    private By _leicaCameraShoppingCart = By.className("product-name");
    private By _buildYourOwnComputerShoppingCart = By.xpath("//a[@class= 'product-name']");
    private By _detailsFromShoppingCart = By.xpath("//td[@class='product']/div[1]");
    private By _checkOut = By.xpath("//button[@id ='checkout']");
    private By _termsOfService = By.xpath("//input[@id = 'termsofservice']");
    String productNameBeforeAddToCart = "Build your own computer";

    String expectedResult = "Processor: 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]\n" +
            "RAM: 8GB [+$60.00]\n" +
            "HDD: 320 GB\n" +
            "OS: Vista Premium [+$60.00]\n" +
            "Software: Microsoft Office [+$50.00]\n" +
            "Software: Acrobat Reader [+$10.00]\n" +
            "Software: Total Commander [+$5.00]";
    public void verifyProductNameFromShoppingCart(){
        String productNameFromShoppingCart = getTextFromElement(_buildYourOwnComputerShoppingCart);
        System.out.println("Product name from shopping cart is: "+productNameFromShoppingCart);
        //Assert to verify the actual message and expected message
        Assert.assertEquals(productNameBeforeAddToCart,productNameFromShoppingCart);
    }
    public void verifyProductDetailsFromShoppingCart(){
        explicitWaitClick(_buildYourOwnComputerShoppingCart);
        String productName = getTextFromElement(_buildYourOwnComputerShoppingCart);
        System.out.println("Product name is: " + productName);
        String productDetails = getTextFromElement(_detailsFromShoppingCart);
        System.out.println("Product details: " + productDetails);
       Assert.assertEquals(productDetails,expectedResult);
       clickOnTheElement(_termsOfService);
       clickOnTheElement(_checkOut);

    }
}
