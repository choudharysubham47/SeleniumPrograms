import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ScrollPage {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/admin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Navigate Command
        driver.get("https://selectorshub.com/");

        //Maximize
        driver.manage().window().maximize();

        //delete all cookies
        driver.manage().deleteAllCookies();

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //ExplicitWait
      //  WebDriverWait wait = new WebDriverWait(driver,10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

        //Scroll Command
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)","");

        //getTitle
        String titile = driver.getTitle();
        System.out.println(titile);

        //currentURL
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        //pageSource
        System.out.println(driver.getPageSource());

        List allLinks = driver.findElements(By.xpath("/a"));
        System.out.println(allLinks.size());

        //Position of window
        Point position= driver.manage().window().getPosition();
        System.out.println("Position of window is: "+position);

        //Close commands
        driver.close();
        driver.quit();
    }
}
