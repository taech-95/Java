import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdateDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement dynamicDropDown = chromeDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        dynamicDropDown.click();
        chromeDriver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(1000);
        chromeDriver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();



    }
}
