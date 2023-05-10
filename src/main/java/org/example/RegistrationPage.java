package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils{
    private By _firstname = By.xpath("//input[contains(@id,\"FirstName\")]");
    private By _lastname = By.xpath("//input[contains(@id,\"LastName\")]");
    private By _emailAddress = By.xpath("//input[starts-with(@id,\"Email\")]");
    private By _password = By.xpath("//input[starts-with(@id,\"Password\")]");
    private By _confirmPassword = By.xpath("//input[starts-with(@id,\"ConfirmPassword\")]");
    private By _registerSubmitButton = By.xpath("//button[starts-with(@id,\"register-button\")]");
    private By _birthdate = By.xpath("//select[@name =\"DateOfBirthDay\"]");
    private By _birthMonth = By.xpath("//select[@name =\"DateOfBirthMonth\"]");
    private By _birthYear = By.xpath("//select[@name =\"DateOfBirthYear\"]");
    public void FillTheElement(){
        //Type the first name
        typeTheText(_firstname,"First Name");
        //Type the last name
        typeTheText(_lastname,"Last Name");
        //Select day of birth from dropdown
        selectElementByIndex(_birthdate,8);
        //select month of birth from dropdown
        selectElementByValue(_birthMonth,"4");
        //select year of birth from dropdown
        selectElementByText(_birthYear,"1985");
        //Type the email address
        typeTheText(_emailAddress,"testmail" + timestamp() + "@gmail.com");
        //Type the password
        typeTheText(_password,"test1234");
        //Type the confirmPassword
        typeTheText(_confirmPassword,"test1234");
        //Click on register submit
        clickOnTheElement(_registerSubmitButton);

    }
    public void ForRegisteredUser(){
        //Type the first name
        typeTheText(_firstname,"First Name");
        //Type the last name
        typeTheText(_lastname,"Last Name");
        typeTheText(_emailAddress,"testmail12@gmail.com");
        //Type the password
        typeTheText(_password,"test12345");
        //Type the confirmPassword
        typeTheText(_confirmPassword,"test12345");
        //Click on register submit
        clickOnTheElement(_registerSubmitButton);

    }

}
