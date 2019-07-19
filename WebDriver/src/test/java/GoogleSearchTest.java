import com.codeborne.selenide.impl.ScreenShotLaboratory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleSearchTest extends BaseSeleniumTest {



    @Test
    public void googleSearchTest() {

        SeleniumHelper helper = new SeleniumHelper(driver);

        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        helper.takeScreenshot();

        searchInput.sendKeys(Keys.ENTER);
        driver.findElement(By.partialLinkText("Selenium - Web Browser Automation")).click();
        helper.takeScreenshot();


        Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");

    }

}
