//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.concurrent.TimeUnit;
//
//public class WaitCommands {
//    public static void main(String s[])
//    {
//        System.setProperty("webdriver.chrome.driver","/Users/admin/Desktop/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
       // ImplicitWait
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.navigate().to("https://selectorshub.com/");
//
        //ExplicitWait
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='PracticePage']")));
//
        //driver.navigate().to("https://selectorshub.com/");
//        driver.quit();
//    }
//}
