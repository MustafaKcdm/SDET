package Gun05;

import Utility.BaseDriver;
import Utility.My_Func;
import org.omg.CORBA.MARSHAL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        My_Func.Bekle(3);
        WebElement element = driver.findElement(By.id("alerttestjs"));
        element.click();
        My_Func.Bekle(3);

        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        My_Func.Bekle(3);

        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        My_Func.Bekle(3);

        System.out.println(driver.getCurrentUrl());


        BekleKapat();
    }
}
