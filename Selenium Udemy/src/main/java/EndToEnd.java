import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class EndToEnd {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        chromeDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        WebElement dynamicDropDown = chromeDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        dynamicDropDown.click();
        chromeDriver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(1000);
        chromeDriver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        Thread.sleep(500);
        //chromeDriver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
        chromeDriver.findElement(By.cssSelector(".ui-state-highlight")).click();

//        if(chromeDriver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
//        {
//            System.out.println("its enabled");
//            Assert.assertTrue(false);
//        }
//        else
//        {
//            System.out.println("its disabled");
//            Assert.assertTrue(true);
//        }

        chromeDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        chromeDriver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    }

}
