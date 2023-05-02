package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends Utils {

    private By _registerButton =By.xpath("//a[@class = \"ico-register\"]");
    private By _goodButton = By.xpath("//input[starts-with(@id,\"pollanswers-2\")]");
    private By _voteButton = By.xpath("//button[contains(@class,\"button-2 vote-poll-button\")]");
    private By _errorMessage = By.id("block-poll-vote-error-1");
    private By _electronics = By.xpath("//ul[@class = \"top-menu notmobile\"]/li[2]");

    private By _addToCartAppleMacBook = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By _excellentVote = By.xpath("//div[@class = \"home-page-polls\"]/div[2]/ul/li[1]");
    private By _goodVote = By.xpath("//div[@class = \"home-page-polls\"]/div[2]/ul/li[2]");
    private By _poorVote = By.xpath("//div[@class = \"home-page-polls\"]/div[2]/ul/li[3]");
    private By _varyBadVote = By.xpath("//div[@class = \"home-page-polls\"]/div[2]/ul/li[4]");
    private By _totalVotes = By.className("poll-total-votes");
    private By _addToComparebuildYourOwnComputer = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/button[2]");
   private By _closeBarNotification = By.xpath("//div[@class = \"bar-notification success\"]/span");
   private By _addToCompareAppleMacBook = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[2]");
   private By _productComparison = By.xpath("//div[@class=\"bar-notification success\"]/p/a");
   String expectedErrorMessage = "Register user can vote";
    String expectedVoteMessage = "8 vote(t)";

    public void clickOnRegisterButton(){
        //click on register button
        clickOnTheElement(_registerButton);
    }

    public void clickOnGoodButton(){
     explicitWaitClick(_goodButton);
     //click on good button
    clickOnTheElement(_goodButton);
    }
    public void clickOnVoteButton(){
        //click on vote button
        clickOnTheElement(_voteButton);
    }
    public void verifyUserVoteSuccessfully(){
        //use wait
        explicitWaitClick(_errorMessage);
        //capture the error message
        String actualErrorMessage = getTextFromElement(_errorMessage);
        System.out.println("Error message is: "+actualErrorMessage);
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Voting is not working");

    }
    public void clickOnElectronics(){
        //click on electronics button
        clickOnTheElement(_electronics);
    }


    public void addToCartAppleMacBook(){
        //click on add to cart of Apple MacBook
        clickOnTheElement(_addToCartAppleMacBook);
    }
    public void verifyVote(){
        //use wait
        explicitWaitClick(_excellentVote);
        //capture the excellent vote
        String excellentVote = getTextFromElement(_excellentVote);
        System.out.println("Excellent vote: " + excellentVote);
        //capture the good vote
        String goodVote = getTextFromElement(_goodVote);
        System.out.println("Good vote: " + goodVote);
        //capture the poor vote
        String poorVote = getTextFromElement(_poorVote);
        System.out.println("Poor vote: " + poorVote);
        //capture the very bad vote
        String veryBadVote = getTextFromElement(_varyBadVote);
        System.out.println("Very bad vote: "+ veryBadVote);
        //capture the total votes
        String totalVotes = getTextFromElement(_totalVotes);
        System.out.println("Total votes are: " + totalVotes);
        //Assert to verify the actual message and expected message
        Assert.assertEquals(totalVotes, expectedVoteMessage, "Thanks for voting");

    }
    public void addToCompareList() throws InterruptedException {
        //Click on add to compare list button Build your own computer
        clickOnTheElement(_addToComparebuildYourOwnComputer);
        //Click on close bar notification
       // clickOnTheElement(_closeBarNotification);
        Thread.sleep(3000);
        //explicitWaitClick(_productComparison);
        //Click on add to compare list button Apple MacPro Pro 13-inch
        clickOnTheElement(_addToCompareAppleMacBook);
        Thread.sleep(3000);
        //explicitWaitClick(_productComparison);
        //waitForElementToBeVisible(_productComparison);
        //Click on product comparison
         clickOnTheElement(_productComparison);

    }
}
