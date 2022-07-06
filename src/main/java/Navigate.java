import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navigate {
    public static void main(String s[]) {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //ImplicitWait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Navigate To
        driver.navigate().to("https://selectorshub.com/");
        System.out.println(driver.getTitle());

        //Navigate Back
        driver.navigate().back();
        System.out.println(driver.getTitle());

        //Navigate Forward
        driver.navigate().forward();
        System.out.println(driver.getTitle());

        //Refresh
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.quit();
    }
}