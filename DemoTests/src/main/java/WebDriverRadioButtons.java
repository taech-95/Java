import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebDriverRadioButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Mykola/Documents/GitHub/Java/DemoTests/src/main/webapp/RadioButtonTest.html");

        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();

        for (WebElement radioButton :radioButtons){
            if(radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }
        }

        WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
        checkbox.click();

        WebElement selectElement = driver.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Maybe");

        WebElement outerTable = driver.findElement(By.tagName("table"));
        WebElement innerTable = outerTable.findElement(By.tagName("table"));
        WebElement row = innerTable.findElements(By.tagName("td")).get(1);


        WebElement row2 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[1]"));
        System.out.println(row.getText());
        System.out.println(row2.getText());

    }
}
