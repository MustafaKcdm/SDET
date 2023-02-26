package Assignments.Odev_2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S2 extends BaseDriver {
    @Test
    public void Test2(){
        driver.get("https://demo.applitools.com/");
        WebElement usernameTB = driver.findElement(By.cssSelector("input[placeholder='Enter your username']"));
        usernameTB.sendKeys("ttechno@gmail.com");
        WebElement passwordTB = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
        passwordTB.sendKeys("techno123.");
        WebElement signInB = driver.findElement(By.cssSelector("a[id='log-in']"));
        signInB.click();
        WebElement text = driver.findElement(By.cssSelector("h6[id='time']"));
        Assert.assertTrue("TEST FAILED", text.isDisplayed());


        BekleKapat();
    }
}
