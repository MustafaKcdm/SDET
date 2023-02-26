package Assignments.Odev_2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S5 extends BaseDriver {
    @Test
    public void Test5(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fLink = driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        fLink.click();
        WebElement sButton = driver.findElement(By.cssSelector("input[class='styled-click-button']"));
        sButton.click();
        WebElement oButton = driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        oButton.click();



        BekleKapat();
    }
}
