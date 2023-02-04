import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import static java.lang.Thread.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("https://rahulshettyacademy.com/locatorspractice/");
        String title = chromeDriver.getTitle();
        chromeDriver.getCurrentUrl();
        System.out.println(title);
        chromeDriver.findElement(By.id("inputUsername")).sendKeys("rahul");
        chromeDriver.findElement(By.name("inputPassword")).sendKeys("123sdasd");
        chromeDriver.findElement(By.className("signInBtn")).click();
        System.out.println(chromeDriver.findElement(By.cssSelector("p.error")).getText());
        chromeDriver.findElement(By.linkText("Forgot your password?")).click();
        chromeDriver.findElement(By.xpath("//input[@placeholder='Name']"))
                .sendKeys("Mykola");
        chromeDriver.findElement(By.xpath("//input[@placeholder='Email']"))
                .sendKeys("mykola.maksymov@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@placeholder='Phone Number']"))
                .sendKeys("+48720940978");
        sleep(1000);
        chromeDriver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(chromeDriver.findElement(By.className("infoMsg")).getText());
        chromeDriver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        sleep(1000);
        chromeDriver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        chromeDriver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        chromeDriver.findElement(By.id("chkboxOne")).click();
        chromeDriver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
        Assert.assertEquals(chromeDriver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

    }
}
