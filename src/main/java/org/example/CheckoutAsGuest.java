package org.example;

import org.openqa.selenium.By;

public class CheckoutAsGuest extends Utils{
    private By _checkoutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");

    public void checkoutAsGuestSuccessfully(){
        //click on checkout as guest
        clickOnTheElement(_checkoutAsGuest);


    }

}
