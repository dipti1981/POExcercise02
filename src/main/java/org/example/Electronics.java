package org.example;

import org.openqa.selenium.By;

public class Electronics extends Utils{
    private By _cameraAndPhoto = By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/h2/a");
    public void clickOnCameraAndPhoto(){
        //click on camera and photo button
        clickOnTheElement(_cameraAndPhoto);
    }
}
