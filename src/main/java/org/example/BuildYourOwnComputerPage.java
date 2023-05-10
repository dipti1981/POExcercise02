package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utils{
    private By _processorDropDown = By.xpath("//dd[@id = 'product_attribute_input_1']/select");
    private By _ramDropDown = By.xpath("//dd[@id = 'product_attribute_input_2']/select");
    private By _hdd320GB = By.xpath("//input[@id ='product_attribute_3_6']");
    private By _osVistaPremium = By.xpath("//input[@id = 'product_attribute_4_9']");
    private By _softwareMicrosoftOffice = By.xpath("//input[@id = 'product_attribute_5_10']");
    private By _softwareAcrobatReader = By.xpath("//input[@id = 'product_attribute_5_11']");
    private By _softwareTotalCommander = By.xpath("//input[@id = 'product_attribute_5_12']");
    private By _addToCart = By.xpath("//button[@id = 'add-to-cart-button-1']");
    private By _closeBar = By.xpath("//p[@class='content']");
    private By _shoppingCart = By.className("ico-cart");
    public void addDetailsOfBuildYourOwnComputer(){
        explicitWaitClick(_processorDropDown);
       // clickOnTheElement(_processorDropDown);
        selectElementByValue(_processorDropDown,"2");
       // clickOnTheElement(_ramDropDown);
        selectElementByValue(_ramDropDown,"5");
        clickOnTheElement(_hdd320GB);
        clickOnTheElement(_osVistaPremium);
       //clickOnTheElement(_softwareMicrosoftOffice);
        clickOnTheElement(_softwareAcrobatReader);
        clickOnTheElement(_softwareTotalCommander);
        explicitWaitClick(_addToCart);
        clickOnTheElement(_addToCart);
        explicitWaitInvisible(_closeBar);
        clickOnTheElement(_shoppingCart);

    }
}
