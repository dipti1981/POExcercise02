package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    private By _leicaCameraShoppingCart = By.className("product-name");
    String productNameBeforeAddToCart = "Leic T Mirroless Digital Camera";
    public void verifyProductNameFromShoppingCart(){
        String productNameFromShoppingCart = getTextFromElement(_leicaCameraShoppingCart);
        System.out.println("Product name from shopping cart is: "+productNameFromShoppingCart);
        //Assert to verify the actual message and expected message
        Assert.assertEquals(productNameBeforeAddToCart,productNameFromShoppingCart);
    }
}
