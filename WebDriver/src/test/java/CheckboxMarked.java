import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxMarked {


    @Test
    public void googleOpenTest() throws InterruptedException {
        String driverPath = "/home/jacek/Desktop/SeleniumKursID/src/main/resources/executables/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        Dimension dimension = new Dimension(800, 800);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///home/jacek/Desktop/PlikiTestowe/Test.html");

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if(checkbox.isSelected()) {
            System.out.println("Checbbox jest zaznaczony");
            checkbox.click();
            System.out.println("Checkbox został odznaczony");
        } else {
            System.out.println("Checkbox nie jest zaznaczony");

        }


    }
}
