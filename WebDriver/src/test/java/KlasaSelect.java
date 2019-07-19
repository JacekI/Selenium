import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class KlasaSelect {


    @Test
    public void googleOpenTest() throws InterruptedException {
        String driverPath = "/home/jacek/Desktop/SeleniumKursID/src/main/resources/executables/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        Dimension dimension = new Dimension(800, 800);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///home/jacek/Desktop/PlikiTestowe/Test.html");
        Select carSelect = new Select(driver.findElement(By.tagName("select")));
        //carSelect.selectByIndex(2);
        //carSelect.selectByVisibleText("Saab");
        carSelect.selectByValue("saab");

        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Jacek  Iwasieczko");
        System.out.println("Wartość to " + firstNameInput.getText());
        System.out.println("Wartość to " + firstNameInput.getAttribute("value"));

        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println("Wartość dla label to  " + label.getText());



   }
}