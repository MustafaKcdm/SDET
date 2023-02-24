package Gun04;

import Utility.My_Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu = driver.findElement(By.name("q8_name[first]"));//nam ile elemanı bulma
        isimKutusu.sendKeys("İsmet");//istenilen string değeri yazdırma

        My_Func.Bekle(5);
        driver.quit();
    }
}
