import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;

public class auto_test_1 {


    public static void main(String[] args) throws MalformedURLException {
        //MainTests tests = new MainTests();
//        tests.testDemoLogin();
////        tests.testDemoPulpit();
////        tests.closeWebDriver();


        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
        driver.get("http://gooogle.com");
        WebElement acceptAll = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        acceptAll.click();
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Зображення")));

        WebElement imagesLink = driver.findElements(By.xpath(("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a"))).get(0);
        imagesLink.click();

        WebElement imageElement = driver.findElements(By.cssSelector("img[class='rg_i Q4LuWd']")).get(0);
        imageElement.click();


    }
}
