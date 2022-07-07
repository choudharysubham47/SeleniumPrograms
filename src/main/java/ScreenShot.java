import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
    public static void main(String s[]) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/admin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Launch");

        //driver.manage().window().maximize();
        //System.out.println("Window Maximize");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://selectorshub.com/");
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        File source = null;
        FileUtils.copyFile(source, new File("./Users/admin/Desktop/SeleniumPrograms/Screenshots/Screen.png"));
        System.out.println("the Screenshot is taken");
        driver.close();
    }
}
