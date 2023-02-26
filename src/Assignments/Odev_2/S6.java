package Assignments.Odev_2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S6 extends BaseDriver {

    @Test
    public void Test6(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fLink = driver.findElement(By.cssSelector(" a[id='fakealerttest']"));
        fLink.click();
        WebElement sMButton = driver.findElement(By.cssSelector("input[onclick='show_modal()']"));
        sMButton.click();
        WebElement kBtutton = driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        kBtutton.click();
        BekleKapat();
    }
}
