import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HoverOver {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/admin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.getTitle();
        driver.getCurrentUrl();

       // WebDriverWait wait = new WebDriverWait(driver,10);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));


        WebElement lin = driver.findElement(By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Courses']"));
        Actions ac = new Actions(driver);
        ac.moveToElement(lin).click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.close();
    }
}
