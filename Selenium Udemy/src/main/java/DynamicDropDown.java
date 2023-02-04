import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        chromeDriver.findElement(By.id("autosuggest")).sendKeys("Uk");
        Thread.sleep(1000);
        List<WebElement> countries = chromeDriver.findElements(By.cssSelector("li[class='ui-menu-item'] a "));
        for (WebElement country : countries) {
            if(country.getText().equalsIgnoreCase("Ukraine")) {
                country.click();
                break;
            }
        }
    }
}
