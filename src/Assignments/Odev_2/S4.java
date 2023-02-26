package Assignments.Odev_2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S4 extends BaseDriver {
    @Test
    public void Test4(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate = driver.findElement(By.cssSelector("a[id='calculate']"));
        calculate.click();
        WebElement n1 = driver.findElement(By.cssSelector("input[id='number1']"));
        n1.sendKeys("10");
        WebElement n2 = driver.findElement(By.cssSelector("input[id='number2']"));
        n2.sendKeys("10");
        WebElement cbutton = driver.findElement(By.cssSelector("input[id='calculate']"));
        cbutton.click();
        WebElement answer = driver.findElement(By.cssSelector("span[id='answer']"));
        System.out.println("Cevap= " + answer.getText());



        BekleKapat();
    }
}
