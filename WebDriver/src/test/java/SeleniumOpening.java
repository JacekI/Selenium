import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumOpening {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("Przed klasą");
        String driverPath = "/home/jacek/Desktop/SeleniumKursID/src/main/resources/executables/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void seleniumOpeningTest() {


        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.partialLinkText("Selenium - Web Browser Automation"));
        seleniumPageLink.click();

        Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");

    }

    @AfterTest
    public void tearDown() {
        System.out.println("Wykonuje się po klasie");
        //driver.quit();
    }


}

