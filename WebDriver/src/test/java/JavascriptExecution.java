import cucumber.api.java.bs.A;
import cucumber.api.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavascriptExecution extends BaseSeleniumTest {



@Test
public void googleSearchTest() {
    driver.get("https://www.w3schools.com");
    Actions action = new Actions(driver);
    action.moveToElement(driver.findElement(By.id("navbtn tutorials"))).build().perform();


}

}

   /*

   @Test

    public void googleSearchTest() {
        driver.get("https://www.google.com/");
        WebElement searchInput = driver.findElement(By.name("q"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);
        action.contextClick().build().perform();
        executor.executeScript("arguments[0].setAttribute('value', 'Selenium')", searchInput);
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumLink = driver.findElement(By.linkText("Selenium - Web Browser Automation"));
        executor.executeScript("argument[0].click();", seleniumLink);
       Assert.assertEquals((driver.getTitle()), "Selenium - Web Browser Automation");


      */

  //  }
//}
