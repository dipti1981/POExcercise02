package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class FaceBookPage extends Utils {
    private By _allowAllCookies = By.xpath("(//div[@aria-label = 'Allow all cookies'])[2]/div[1]/div[1]");
    private By _closeButton = By.xpath("//div[@aria-label = 'Close']/i");
    private By _emailOrPhone = By.xpath("//input[@placeholder = 'Email or phone']");
    private By _password = By.xpath("//input[@placeholder='Password']");
    private By _login = By.xpath("(//span[@class = 'x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'])[1]");
    private By _label = By.xpath("(//label[@class='xi81zsa x6prxxf xvq8zen'])[1]");
    public void verifyFaceBook()  {
        //capture child url
        String childWindow = driver.getCurrentUrl();
        System.out.println("Child url is: " + childWindow);
        Assert.assertEquals(childWindow,"https://www.facebook.com/nopCommerce");
         explicitWaitClick(_allowAllCookies);
         //click on allow all cookies
        clickOnTheElement(_allowAllCookies);
        //click on close button
        clickOnTheElement(_closeButton);

        //verify all the elements
        if(driver.findElements(_emailOrPhone).size() !=0){
            System.out.println("Email or phone is present");
        }else{
            System.out.println("Email or phone is not present");
        }if(driver.findElements(_password).size() !=0){
            System.out.println("Password is present");
        }else{
            System.out.println("Password is not present");
        }if(driver.findElements(_login).size() !=0){
            System.out.println("Log in is present");
        }else{
            System.out.println("Log is not present");
        }
        driver.close();
        //switch to parent window
        driver.switchTo().window(HomePage.ParentWindow);


    }
}
