package Sel;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ianoe\\JavaSDET-Training\\Drivers\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("search");
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(4000);
        driver.quit();
    }
}
