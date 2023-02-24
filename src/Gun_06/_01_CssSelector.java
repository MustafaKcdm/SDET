package Gun_06;

import Utility.BaseDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.junit.Test;

public class _01_CssSelector extends BaseDriver {


        @Test
                public void Test1() {

            // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
            // 2-Butona tıklatınız
            // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.


            driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
            WebElement tbox = driver.findElement(By.cssSelector("input[id='user-message']"));
            String msg = "Test Text";
            tbox.sendKeys(msg);


            WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
            btn.click();

            WebElement lbl = driver.findElement(By.cssSelector("[id='display']"));
            Assert.assertTrue("Mesaj Eşlemedi", lbl.getText().equals(msg));
            // beklenen expect
            // assertTrue: içindeki değer True mu ? True ise hiç bir şey yapmaz.mesaj vermez
            // değilse beklenen olmamışsa hata mesajı verir.
            //yani genel kural : Hata var ise göster

            BekleKapat();

        }
//            [id^='u_'] -> id si    u_ ile başlayan  startWith
//            [id*='u_'] -> id sinde u_ geçen         contains
//            [id$='u_'] -> id si    u_ ile biten     endWith

        }


