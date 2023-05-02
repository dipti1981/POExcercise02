package org.example;

import org.openqa.selenium.By;

public class CameraAndPhoto extends Utils{
    private By _leicaCameraBeforeAddToCart = By.xpath("//div[@class = \"item-grid\"]/div[3]/div[1]/div[2]/h2");
    private By _addToCart = By.xpath("//div[@class = \"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By _shoppingCart = By.xpath("//span[starts-with(@class,\"cart-label\")]");

    public void captureTheProductNameBeforeAddToCart(){
        //capture the product name before add to cart
        String productNameBeforeAddToCart = getTextFromElement(_leicaCameraBeforeAddToCart);
        System.out.println("Product name before add to cart is: "+productNameBeforeAddToCart);
    }
    public void clickOnAddToCart(){
        //click on add to cart button
        clickOnTheElement(_addToCart);
    }
    public void clickOnShoppingCart(){
        //click on shopping cart button
        clickOnTheElement(_shoppingCart);
    }

}
