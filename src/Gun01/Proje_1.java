package Gun01;

import Utility.My_Func;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Proje_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://campus.techno.study");//ilgili sayafaya gider
        My_Func.Bekle(5);//5 saniye bekler
        driver.quit();//pencereyi kapatır

    }


    }