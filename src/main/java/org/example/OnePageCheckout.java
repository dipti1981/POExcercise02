package org.example;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OnePageCheckout extends Utils{
    private By _firstname = By.cssSelector("input#BillingNewAddress_FirstName");
    private By _lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    private By _email = By.xpath("//input[@id='BillingNewAddress_Email']");
    private By _country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    private By _city = By.xpath("//input[@id='BillingNewAddress_City']");
    private By _address = By.xpath("//input[@id = 'BillingNewAddress_Address1']");
    private By _zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    private By _phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    private By _continue = By.xpath("//div[@id ='billing-buttons-container']/button[4]");
    private By _nextDayAir = By.cssSelector("input#shippingoption_1");
    private By _continueAfterNextDayAir = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
  //  private By _creditCard = By.xpath("//input[@id = 'paymentmethod_1']");
    private By _creditCard = By.cssSelector("input#paymentmethod_1");
    private By _continueAfterCreditCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    //private By _continueAfterCreditCardContinue = By.className("button-1 payment-info-next-step-button");
    private By _visa = By.xpath("//select[@id='CreditCardType']");
    private By _cardholderName = By.xpath("//input[@id='CardholderName']");
    private By _cardNumber = By.xpath("//input[@id='CardNumber']");
    private By _expirationDate = By.xpath("//select[@id='ExpireMonth']");
    private By _expirationYear = By.xpath("//select[@id='ExpireYear']");
    private By _cardCode = By.xpath("//input[@id='CardCode']");
    private By _continueAfterPayment = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private By _confirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
   private By _yourOrderProcessed = By.xpath("//div[@class='section order-completed']//div[@class='title']");
   private By _orderNumber = By.xpath("//div[@class='section order-completed']/div[2]/div[1]/strong");
    String expectedThankYouMessage = "Your order has been successfully processed!";

    public void fillTheDetails()  {
        //type the first name
        typeTheText(_firstname,"First name");
        //type the last name
        typeTheText(_lastName,"Last name");
        //type the email
        typeTheText(_email,"test12@gmail.com");
        //select country from drop down
        selectElementByText(_country,"United Kingdom");
        //type the city name
        typeTheText(_city,"Harrow");
        //type the address
        typeTheText(_address,"26,Mount everest");
        //type the zip code
        typeTheText(_zipCode,"ha2 0gs");
        //type the phone number
        typeTheText(_phoneNumber,"0723456778");
        //click on continue
        clickOnTheElement(_continue);
        //using wait
        explicitWaitClick(_nextDayAir);
        //select shipping
        clickOnTheElement(_nextDayAir);
        //click on continue
        clickOnTheElement(_continueAfterNextDayAir);
        //use wait
        explicitWaitClick(_creditCard);
        //click on credit card
        clickOnTheElement(_creditCard);
        //click on continue
        clickOnTheElement(_continueAfterCreditCard);
        //use wait
        explicitWaitClick(_visa);
        //select visa value
        selectElementByText(_visa,"Visa");
        //type the CardHolder name
        typeTheText(_cardholderName,"Jana Thiel");
        //type card number
        typeTheText(_cardNumber,"4916054318153691");
        //select expiration date by value
        selectElementByValue(_expirationDate,"12");
        //select expiration year by year
        selectElementByValue(_expirationYear,"2025");
        //type card code
        typeTheText(_cardCode,"877");
        //click on continue
        clickOnTheElement(_continueAfterPayment);
        //use wait
        explicitWaitClick(_confirm);
        //click on confirm
        clickOnTheElement(_confirm);
        //capture the ThankYou message
        waitForElementToBeVisible(_yourOrderProcessed);
        String yourOrderProcessed = getTextFromElement(_yourOrderProcessed);
        System.out.println("Thank you message is: " + yourOrderProcessed);
        //capture the order number
        String orderNumber = getTextFromElement(_orderNumber);
        System.out.println("Order number: " + orderNumber);
        //Assert to verify the actual and expected
        Assert.assertEquals(yourOrderProcessed,expectedThankYouMessage,"Thank you for shopping");

    }
}
