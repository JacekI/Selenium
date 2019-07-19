import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebdriverWait extends BaseSeleniumTest {


    @Test
    public void waitTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("file:///home/jacek/Desktop/PlikiTestowe/Waits.html");
        driver.findElement(By.tagName("button")).click();
        waitForEelement(By.tagName("p"));
        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println(paragraph.getText());
        Assert.assertTrue(paragraph.getText().equals("Dopiero się pojawiłem!"));

    }

    public void waitForEelement(By locator) {

        Wait<WebDriver> wait = new WebDriverWait(driver, 10L);
        ((WebDriverWait) wait).pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));



    }
}


