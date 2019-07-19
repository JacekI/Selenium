import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWait extends BaseSeleniumTest {


    @Test
    public void waitTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("file:///home/jacek/Desktop/PlikiTestowe/Waits.html");
        driver.findElement(By.tagName("button")).click();
        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println(paragraph.getText());
        Assert.assertTrue(paragraph.getText().equals("Dopiero się pojawiłem!"));

    }

}
