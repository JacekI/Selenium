import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseSeleniumTest {

    @Test
    public void uploadFileTest() {
        driver.get("file:///home/jacek/Desktop/PlikiTestowe/FileUpload.html");
        driver.findElement(By.id("myFile"));
        String path = new File("src/main/resources/test620000000.png").getAbsolutePath();
        driver.findElement(By.id("myFile")).sendKeys(path);


    }


}
