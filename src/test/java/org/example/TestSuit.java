package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    Electronics electronics = new Electronics();
    CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LogInPage logInPage = new LogInPage();
    AppleMacBookPro13Inch appleMacBookPro13Inch = new AppleMacBookPro13Inch();
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
    CompareProduct compareProduct = new CompareProduct();
    FaceBookPage faceBookPage = new FaceBookPage();
    New_Release new_release = new New_Release();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    CheckoutAsGuest checkoutAsGuest = new CheckoutAsGuest();
    OnePageCheckout onePageCheckout = new OnePageCheckout();


    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {


        //click on register button
        homePage.clickOnRegisterButton();
        //fill all the elements
        registrationPage.FillTheElement();
        //verify registration complete message
        registerResultPage.verifyUserRegisterSuccessfully();

    }
    @Test
    public void verifyUserShouldBeAbleToEmailAFriendSuccessfully(){
        //Click on add to cart on Apple MacBook Pro 13-inch
        homePage.addToCartAppleMacBook();
        //Click on email a friend
        appleMacBookPro13Inch.clickOnEmailAFriend();
        //verify the error message
        productEmailAFriend.verifyTheErrorMessage();

    }
    @Test
    public void verifyUserShouldBeAbleToVoteSuccessfully() {
        //click on good button
        homePage.clickOnGoodButton();
        //click on vote button
        homePage.clickOnVoteButton();
        //verify the message
        homePage.verifyUserVoteSuccessfully();
    }
    @Test
    public void verifyUserCanSeeTheCorrectProductInTheShoppingCart(){
        //click on Electronics button
        homePage.clickOnElectronics();
        //click on Camera and Photo Button
        electronics.clickOnCameraAndPhoto();
        //capture the name of the product Leica T Mirrorless Digital Camera
        cameraAndPhoto.captureTheProductNameBeforeAddToCart();
        //click on add to cart
        cameraAndPhoto.clickOnAddToCart();
        //click on shopping cart button
        cameraAndPhoto.clickOnShoppingCart();
        //capture the name of the product Leica T Mirrorless Digital Camera
        shoppingCartPage.verifyProductNameFromShoppingCart();

    }
    @Test
    public void verifyUserRegisteredUserShouldBeAbleToReferProductToAFriendSuccessfully(){
        //click on register
        homePage.clickOnRegisterButton();
        //fill the elements
        registrationPage.ForRegisteredUser();
        //click on login button
        registerResultPage.clickOnLoginButton();
        //fill the login details
        logInPage.fillTheLogInDetails();
        //click on add to cart one product Apple MacBook Pro 13-inch
        homePage.addToCartAppleMacBook();
        //click on email a friend
        appleMacBookPro13Inch.clickOnEmailAFriend();
        //fill the email a friend details
        productEmailAFriend.fillTheDetails();
        //verify the message
        productEmailAFriend.verifyTheMessage();
    }
    @Test
    public void verifyRegisteredUserShouldBeAbleToVoteSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //fill the elements
        registrationPage.ForRegisteredUser();
        //click on login button
        registerResultPage.clickOnLoginButton();
        //fill the login details
        logInPage.fillTheLogInDetails();
        //click on good button
        homePage.clickOnGoodButton();
        //click on vote button
        homePage.clickOnVoteButton();
        homePage.verifyVote();
    }
    @Test
    public void verifyUserShouldBeAbleToCompareTwoProductSuccessfully() throws InterruptedException {
        //click on add to compare list button build your own computer and Apple MacBook
        homePage.addToCompareList();
       //compare two products
        compareProduct.verifyProductComparison();
        //
    }
    @Test
    public void verifyToPrintAllTheProductNameFromHomepage(){
        //print all the products name form home page
        homePage.printOutProductTitle();
    }
    @Test
    public void verifySearchAlertMessage(){
        //verify search alert message
        homePage.verifySearchAlert();
    }
    @Test
    public void VerifyUserShouldBeAbleToSelectCurrencyVerifyAccordinglyOnHomepage(){
        homePage.verifyCurrencyDropDown();
        homePage.productPriceInDollar();
        homePage.productPriceInEuro();
    }
    @Test
    public void VerifyUserClickOnFaceBookPageCanDoAllAction() throws InterruptedException {
        homePage.clickOnFaceBook();
        faceBookPage.verifyFaceBook();
        homePage.verifyWelcomeMessage();

    }
    @Test
    public void VerifyVoteAlertMessageWithoutClickAnyOption(){
        homePage.clickOnVoteButton();
        homePage.verifyVoteAlertMessage();

    }
    @Test
    public void VerifyNewsRelease(){
        homePage.clickOnNewsRelease();
        new_release.newReleaseUpdate();
        new_release.verifyLastAddedComment();

    }
    @Test
    public void VerifyUserShouldBeAbleToSearchForTheGivenProductSuccessfully(){
        homePage.inputInSearch("nike");
    }
    @Test
    public void VerifyGuestUserCheckoutSuccessfully() {
        homePage.addToCartBuildYourOwnComputer();
        buildYourOwnComputerPage.addDetailsOfBuildYourOwnComputer();
        shoppingCartPage.verifyProductDetailsFromShoppingCart();
        checkoutAsGuest.checkoutAsGuestSuccessfully();
        onePageCheckout.fillTheDetails();
    }

}

