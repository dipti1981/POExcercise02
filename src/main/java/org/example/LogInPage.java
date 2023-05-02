package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils{

    private By _emailAddress = By.id("Email");
    private By _Password = By.id("Password");
    private By _logInSubmitButton = By.xpath("//div[@class=\"returning-wrapper fieldset\"]/form/div[3]/button");
    public void fillTheLogInDetails(){
        //type email adress
        typeTheText(_emailAddress,"testmail12@gmail.com");
        //type password
        typeTheText(_Password,"test12345");
        //click on login submit button
        clickOnTheElement(_logInSubmitButton);
    }

}
