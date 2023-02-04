import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorsV2 {



    @BeforeClass
    public void setup(){

    }
    @Test
    public void test() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("https://rahulshettyacademy.com/locatorspractice/");
        String title = chromeDriver.getTitle();
        chromeDriver.getCurrentUrl();
        System.out.println(title);
        chromeDriver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        chromeDriver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        chromeDriver.findElement(By.id("chkboxOne")).click();
        chromeDriver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
        Thread.sleep(1000);
        System.out.println(chromeDriver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(chromeDriver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

    }



}
