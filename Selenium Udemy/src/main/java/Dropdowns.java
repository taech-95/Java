import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.time.Duration;

public class Dropdowns {
    public static void main(String[] args)   {
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //dropodown with select type
        WebElement staticDropdown = chromeDriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        String dropDownText = dropdown.getFirstSelectedOption().getText();
        System.out.println(dropDownText);
        dropdown.selectByVisibleText("AED");
        dropDownText = dropdown.getFirstSelectedOption().getText();
        System.out.println(dropDownText);
        dropdown.selectByValue("INR");
        dropDownText = dropdown.getFirstSelectedOption().getText();
        System.out.println(dropDownText);
        System.out.println(chromeDriver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        chromeDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(chromeDriver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

        System.out.println(chromeDriver.findElement(By.id("Div1")).getAttribute("style"));

        if(chromeDriver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
            System.out.println("its enabled");
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }

    }
}
