import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assesment2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("https://rahulshettyacademy.com/angularpractice/");
        chromeDriver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mykola");
        chromeDriver.findElement(By.name("email")).sendKeys("mykola.maksymov@gmail.com");
        chromeDriver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
        chromeDriver.findElement(By.id("exampleCheck1")).click();
        WebElement staticDropdown = chromeDriver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(1);
        chromeDriver.findElement(By.id("inlineRadio2"));
        chromeDriver.findElement(By.name("bday")).sendKeys("08011995");
        chromeDriver.findElement(By.cssSelector(".btn-success")).click();
        System.out.println(chromeDriver.findElement(By.cssSelector(".alert-success")).getText());

    }
}
