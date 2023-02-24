package Assignments;

import Utility.BaseDriver;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S1 extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://demoqa.com/text-box");
        WebElement tb1 = driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        String s1= "Automaion";
        tb1.sendKeys(s1);

        WebElement tb2 = driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        String s2= "Testing@gmail.com";
        tb2.sendKeys(s2);

        WebElement tb3 = driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        String s3= "Testing Current Address";
        tb3.sendKeys(s3);

        WebElement tb4 = driver.findElement(By.cssSelector("[id='permanentAddress']"));
        String s4= "Testing Permanent Address";
        tb4.sendKeys(s4);

        WebElement btn1 = driver.findElement(By.cssSelector("[id='submit']"));
        btn1.click();

        WebElement name = driver.findElement(By.cssSelector("[id='name']"));
        Assert.assertTrue("Uyumsuz Data",name.getText().equals("Name:Automaion"));

        WebElement mail = driver.findElement(By.cssSelector("[id='email']"));
        Assert.assertTrue("Uyumsuz Data",mail.getText().equals("Email:Testing@gmail.com"));

        WebElement cAddress = driver.findElement(By.cssSelector("[id='currentAddress'][class='mb-1']"));
        Assert.assertTrue("Uyumsuz Data",cAddress.getText().equals("Current Address :Testing Current Address"));

        WebElement pAddress = driver.findElement(By.cssSelector("[id='permanentAddress'][class='mb-1']"));
        Assert.assertTrue("Uyumsuz Data",pAddress.getText().equals("Permananet Address :Testing Permanent Address"));

        BekleKapat();



    }
}
