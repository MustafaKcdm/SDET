package Gun04;

import Utility.My_Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        try{
            WebElement labelF = driver.findElement(By.id("hataliLocator"));
        }
        catch (Exception ex){
            System.out.println("Web lement bulunamadı" + ex.getMessage());
        }
        My_Func.Bekle(3);
        driver.quit();
    }
}
