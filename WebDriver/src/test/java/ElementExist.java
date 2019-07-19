import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementExist {

    @Test
    public void googleOpenTest() throws InterruptedException {
        String driverPath = "/home/jacek/Desktop/SeleniumKursID/src/main/resources/executables/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        Dimension dimension = new Dimension(800, 800);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///home/jacek/Desktop/PlikiTestowe/Test.html");
        checkIfelementExist(driver,By.tagName("a"));
        checkIfelementExist(driver,By.tagName("assas"));

        checkIfElementExist(driver,By.tagName("a"));
        checkIfelementExist(driver,By.tagName("sadas"));


    }

    public boolean checkIfelementExist(WebDriver locator, By driver) {
        if(driver.findElements(locator).size()>0) {
            System.out.println("Element istnieje na stronie");
            return true;
        }
        System.out.println("Brak elementu na stronie");
        return false;
    }

    public void checkIfElementExist(WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
            System.out.println("Element istnieje na stronie");
        } catch (NoSuchElementException exc) {
            System.out.println("Element nie istnieje");

        }
    }
}
