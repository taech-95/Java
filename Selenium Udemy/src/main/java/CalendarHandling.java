import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CalendarHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//        chromeDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        chromeDriver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
        chromeDriver.findElement(By.cssSelector(".ui-state-highlight")).click();



    }
}
