import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitsTest extends  BaseSeleniumTest {



    @Test
    public void waitTest() throws InterruptedException {
        driver.get("file:///home/jacek/Desktop/PlikiTestowe/Waits.html");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(6000);
        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println(paragraph.getText());
        Assert.assertTrue(paragraph.getText().equals("Dopiero się pojawiłem!"));


    }
}
