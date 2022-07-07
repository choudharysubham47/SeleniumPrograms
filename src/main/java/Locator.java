import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locator {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/admin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Launch");
        driver.manage().window().maximize();
        System.out.println("Window Maximize");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://selectorshub.com/");
        System.out.println("Navigate to SelectorHub");

        //ByXpath
        driver.findElement(By.xpath("//a[normalize-space()='PracticePage']")).click();
        System.out.println("User is on the Practice page");
        String name = driver.getTitle();
        System.out.println(name);

        //navigate back
        driver.navigate().back();
        System.out.println("Back to homepage");

        driver.close();
        System.out.println("Chrome Closed");
    }
}
//diver.findElement(By.id());
//driver.findElement(By.name());
//driver.findElement(by.linktext());
//driver.findElement(by.partialLinkText());
//driver.findElement(by.cssSelector());
//driver.findElements(By.tagName("a"));