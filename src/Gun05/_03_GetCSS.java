package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCSS extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter = driver.findElement(By.id("inputValEnter"));

        System.out.println("inputValEnter.getAttribute(\"class\") = " + inputValEnter.getAttribute("class"));

        System.out.println("inputValEnter.getAttribute(\"color\") = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getAttribute(\"font-size\") = " + inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter.getAttribute(\"backgound\") = " + inputValEnter.getCssValue("background"));
        //<input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword" id="inputValEnter"
        // onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands" value="">

        BekleKapat();
    }
}
