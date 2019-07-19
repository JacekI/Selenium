
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() throws InterruptedException {
        String driverPath = "/home/jacek/Desktop/SeleniumKursID/src/main/resources/executables/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        Dimension dimension = new Dimension(800, 800);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///home/jacek/Desktop/PlikiTestowe/Test.html");
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        WebElement firstNameInput = driver.findElement(By.id("fname"));
       firstNameInput.sendKeys("Jacek");
       Thread.sleep(5000);
       firstNameInput.clear();
       firstNameInput.sendKeys("Iwasieczko");

        //WebElement firstNameInput = driver.findElement(By.id("logoOnet"));
       // WebElement klasa = driver.findElement(By.className("sc-1iipyzp-7 fwqMli sc-1iipyzp-6 hqTjcW"));

       // WebElement PoName = driver.findElement(By.name());

      //  driver.quit();
    }


}
