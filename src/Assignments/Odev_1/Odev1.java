package Assignments.Odev_1;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {

    @Test

    public void Test1(){

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement rCheck = driver.findElement(By.cssSelector("input[value='Business'][type='radio']"));
        rCheck.click();
        WebElement list = driver.findElement(By.cssSelector("select[id$='_4588']"));
        list.click();
        WebElement selected = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        selected.click();
        WebElement rCheck2 = driver.findElement(By.cssSelector("input[value='Every Day'][type='radio']"));
        rCheck2.click();
        WebElement rCheck3 = driver.findElement(By.cssSelector("input[value='Good'][type='radio']"));
        rCheck3.click();
        WebElement list2 = driver.findElement(By.cssSelector("select[name$='_4597']"));
        //yada list elemanlarından dördüncüsü olarak da yazılabilir >>> "select[id$='_4597'] > :nth-child(4)"
        list2.click();
        WebElement selected2 = driver.findElement(By.cssSelector("option[value$='a few days']"));
        selected2.click();
        list2.click();





        BekleKapat();
    }
}
