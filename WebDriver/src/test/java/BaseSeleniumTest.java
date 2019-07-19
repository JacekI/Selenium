import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseSeleniumTest {

    protected WebDriver driver;


    @BeforeTest
    public void setUp() {
        System.out.println("Przed klasą");
        String driverPath = "/home/jacek/Desktop/SeleniumKursID/src/main/resources/executables/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterTest
    public void tearDown() {
        System.out.println("Wykonuje się po klasie");
        //driver.quit();


    }
}
