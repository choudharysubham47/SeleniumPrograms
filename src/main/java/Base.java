import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {

    public static void main(String s[])
    {

    }

    public static void setupTestCases(){
        System.setProperty("webdriver.chrome.driver","/Users/admin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Launch");
        driver.manage().window().maximize();
        System.out.println("Window Maximize");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://selectorshub.com/");
        System.out.println("Navigate to SelectorHub");
    }


}
