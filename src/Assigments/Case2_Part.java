package Assigments;

import Utility.BaseDriver;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Case2_Part extends BaseDriver {

    @Test
    public void Case2(){

        driver.get("https://itera-qa.azurewebsites.net");
        WebElement login = driver.findElement(By.cssSelector("[href='/Login']"));
        login.click();
        WebElement username = driver.findElement(By.xpath("//input[@id='Username']"));
        username.sendKeys("İsmetT134");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("1234");
        WebElement buton = driver.findElement(By.xpath("//input[@name='login']"));
        buton.click();
        Assert.assertTrue("TEST FAILED",driver.getCurrentUrl().equals("https://itera-qa.azurewebsites.net/Dashboard"));

        BekleKapat();


    }
}
