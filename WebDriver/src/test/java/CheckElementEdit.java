import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckElementEdit {

    @Test
    public void googleOpenTest() throws InterruptedException {
        String driverPath = "/home/jacek/Desktop/SeleniumKursID/src/main/resources/executables/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        Dimension dimension = new Dimension(800, 800);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///home/jacek/Desktop/PlikiTestowe/Test.html");

        WebElement firstNameInput = driver.findElement(By.name("fname"));

        if(firstNameInput.isEnabled()) {
            System.out.println("Element nie jest zablokowany");
        } else {
            System.out.println("Element jest zablokowany");
        }
        firstNameInput.sendKeys("tomcioDużyDick");

    }

}
