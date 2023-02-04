import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(chromeDriver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected());
        chromeDriver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).click();
        System.out.println(chromeDriver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected());
        List<WebElement> checkboxes = chromeDriver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(checkboxes.size());
        WebElement firstCheckBox = chromeDriver.findElement(By.id("checkBoxOption1"));
        Assert.assertTrue(firstCheckBox.isSelected());
        firstCheckBox.click();
        Assert.assertFalse(firstCheckBox.isSelected());

        List<WebElement> nrOfCheckBoxes = chromeDriver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(nrOfCheckBoxes.size());




    }
}
