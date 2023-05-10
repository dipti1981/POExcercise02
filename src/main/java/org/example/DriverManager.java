package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends Utils{
    public static void openBrowser(){
        //open Chrome browser
        driver = new ChromeDriver();
        //open URL
        driver.get("https://demo.nopcommerce.com/");
        //maximize the window
        driver.manage().window().maximize();
    }
    public static void closeBrowser(){
        //close browser
      //  driver.close();
    }

}
