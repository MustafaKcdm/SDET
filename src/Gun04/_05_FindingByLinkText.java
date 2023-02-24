package Gun04;

import Utility.BaseDriver;
import Utility.My_Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByLinkText extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com");

        WebElement siparisLink = driver.findElement(By.linkText("Siparişlerim"));
        //gözüken texti Siparişlerim olan a tagli web element
        System.out.println(siparisLink.getText());

        System.out.println("siparisLink.getAttribute(\"href\") = " + siparisLink.getAttribute("href"));
        System.out.println("siparisLink.getAttribute(\"title\") = " + siparisLink.getAttribute("title"));
        System.out.println("siparisLink.getAttribute(\"rel\") = " + siparisLink.getAttribute("rel"));
        WebElement link2 = driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText()); //parça olarak arama yapar link elementleri üzerinde
        BekleKapat();
    }
}
