package Assignments.Proje;

import Utility.BaseDriver;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Case1_Part extends BaseDriver {
    @Test
    public void Case1(){
        driver.get("https://itera-qa.azurewebsites.net");

        WebElement sButon = driver.findElement(By.cssSelector("a[class='nav-link'][href='/UserRegister/NewUser']"));
        sButon.click();
        WebElement name = driver.findElement(By.cssSelector(" [id='FirstName']"));
        name.sendKeys("İsmet");
        WebElement surname = driver.findElement(By.xpath("//input[@id='Surname']"));
        surname.sendKeys("Temur");
        WebElement username = driver.findElement(By.xpath("//input[@id='Username']"));
        username.sendKeys("İsmetT134");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123");
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("123");
        WebElement mobile = driver.findElement(By.cssSelector("[id='Mobile']"));
        mobile.sendKeys("05056568656");
        WebElement eposta = driver.findElement(By.cssSelector("[id='E_post']"));
        eposta.sendKeys("ismettmr@gmail.com");
        WebElement submitButon = driver.findElement(By.xpath("//input[@id='submit']"));
        submitButon.click();

        WebElement label = driver.findElement(By.cssSelector("label[class='label-success']"));
        if (label.getText().equals("Username already exist"))
            System.out.println("Kullanıcı Adı Mevcut");
            else
        Assert.assertTrue("Registration Failed", label.getText().equals("Registration Successful"));

        BekleKapat();
    }

}
