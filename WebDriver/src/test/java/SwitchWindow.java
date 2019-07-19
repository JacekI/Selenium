import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindow {

    @Test
    public void googleOpenTest() throws InterruptedException {
        String driverPath = "/home/jacek/Desktop/SeleniumKursID/src/main/resources/executables/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        Dimension dimension = new Dimension(800, 800);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///home/jacek/Desktop/PlikiTestowe/Test.html");


        WebElement newPageButton = driver.findElement(By.id("newPage"));
        String currentWindowName = driver.getWindowHandle();
        newPageButton.click();
        switchToNewWindow(driver,currentWindowName);
        System.out.println("Tytuł to " + driver.getTitle());
        System.out.println("Obecny URL to " + driver.getCurrentUrl());


    }

    private void switchToNewWindow(WebDriver driver, String currentWindowName) {
        System.out.println("Wartość dla obecnego okna to " + currentWindowName);
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Ilość okien przeglądarki " + windows.size());

        for(String window: windows) {
            if (!window.equals(currentWindowName)) {
                driver.switchTo().window(window);
            }

        }


    }
}
