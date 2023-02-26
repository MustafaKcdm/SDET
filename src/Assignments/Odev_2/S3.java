package Assignments.Odev_2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S3 extends BaseDriver {
    @Test
    public void Test3(){
        driver.get("https://www.snapdeal.com/");
        WebElement searchBox = driver.findElement(By.cssSelector("[placeholder='Search products & brands']"));
        searchBox.sendKeys("teddy bear");
        WebElement searchButton = driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
        searchButton.click();
        WebElement text = driver.findElement(By.cssSelector("[id=searchMessageContainer] span[style='color: #212121; font-weight: normal'] "));
        Assert.assertTrue("TEST FAILED", text.getText().equals("We've got 316 results for teddy bear"));


        BekleKapat();
    }
}
