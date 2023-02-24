package Gun04;

import Utility.My_Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_FindingByClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu = driver.findElement(By.className("form-textbox"));//classname ile elemanı bulma
        isimKutusu.sendKeys("İsmet");//istenilen string değeri yazdırma
        //iki adet aynı calssname var ama referansı ilkinden alıp işlem yapar

        List<WebElement> labels = driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());
        for(WebElement a: labels)
            System.out.println("a.getText() = " + a.getText());
        My_Func.Bekle(5);
        driver.quit();
    }
}
