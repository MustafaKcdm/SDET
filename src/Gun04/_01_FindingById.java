package Gun04;

import Utility.My_Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class _01_FindingById {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu = driver.findElement(By.id("first_8"));//id ile elemanı bulma
        isimKutusu.sendKeys("İsmet");//istenilen string değeri yazdırma

        WebElement soyisimKutusu = driver.findElement(By.id("last_8"));//id ile elemanı bulma
        soyisimKutusu.sendKeys("TEMUR");//istenilen string değeri yazdırma

        My_Func.Bekle(3);



        WebElement labelF  = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelF.getText() = " + labelF.getText());

        WebElement labelL = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelL.getText() = " + labelL.getText());

        WebElement buton1 = driver.findElement(By.id("input_2"));
        buton1.click();
        My_Func.Bekle(3);
        driver.quit();
    }
}