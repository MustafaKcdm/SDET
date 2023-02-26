package Assignments.Odev_3;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev3 extends BaseDriver {
    @Test
    public void Test(){

        driver.get(" https://www.saucedemo.com/");
        WebElement usernameTB  = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        usernameTB.sendKeys("standard_user");
        WebElement passwordTB = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordTB.sendKeys("secret_sauce");
        WebElement button = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        button.click();
        WebElement backpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        backpack.click();
        WebElement addToCart = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        addToCart.click();
        WebElement backButton = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']"));
        backButton.click();
        WebElement tShirt = driver.findElement(By.xpath("//img[@alt='Sauce Labs Bolt T-Shirt']"));
        tShirt.click();
        WebElement addToCart2 = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        addToCart2.click();
        WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();
        WebElement cOut =driver.findElement(By.xpath("//button[text()='Checkout']"));
        cOut.click();
        WebElement fName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        fName.sendKeys("Mustafa");
        WebElement lName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lName.sendKeys("Kocaadam");
        WebElement pCode =  driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        pCode.sendKeys("06220");
        WebElement continueB = driver.findElement(By.xpath("//input[@id='continue']"));
        continueB.click();
        int i1,i2, tax;
        WebElement item1 = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        System.out.println("item1 = " + item1.getText());






    }
}
