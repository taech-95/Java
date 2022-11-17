import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.wikipedia.org");


        WebElement searchTerm =  driver.findElement(By.id("searchInput"));
        String searchStr = "Ukraine";
        searchTerm.sendKeys(searchStr);

        WebElement lookButton  = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
        lookButton.click();


        //locators
//        Long start = System.currentTimeMillis();
//        driver.findElement(By.id("js-link-box-uk"));
//        Long end = System.currentTimeMillis();
//        System.out.println(end-start);
//        //xpath
//        start = System.currentTimeMillis();
//        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[1]"));
//        end = System.currentTimeMillis();
//        System.out.println(end-start);
//        start = System.currentTimeMillis();
//        driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang1"));
//        end = System.currentTimeMillis();
//        System.out.println(end-start);

//        WebElement titleOfWebPage =  driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));
//        String titleText = titleOfWebPage.getText();

//        WebElement webElement =  driver.findElement(By.id("js-link-box-uk"));
//        webElement.click();
//        WebElement foundText = driver.findElement(By.id("Ласкаво_просимо_до_Вікіпедії,"));
//        String expectedText = "Ласкаво просимо до Вікіпедії,";
//
//        if(foundText.getText().equals(expectedText)){
//
//            System.out.println("Test has passed");
//        }
//        else{
//            System.out.println("Test didn't pass");
//            driver.close();
//            //throw new Exception();
//        }


//        String expectedText = "Wikipedia";
//        if(expectedText.equals(titleText) ){
//            System.out.println("Test has passed");
//        }
//        else{
//            System.out.println("Test didn't pass");
//            driver.close();
//            //throw new Exception();
//        }
//        driver.close();
    }
}
