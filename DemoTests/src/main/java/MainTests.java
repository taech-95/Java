import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTests{
    private WebDriver webDriver;

    public MainTests() {
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");

    }

    public void testDemoLogin(){
        this.webDriver = new ChromeDriver();
        webDriver.get("https://demobank.jaktestowac.pl/logowanie_etap_1.html");
        String title = webDriver.getTitle();
        System.out.println(title);
        assert title.equals("Demobank - Bankowość Internetowa - Logowanie");

    }

    public void testDemoPulpit(){
        this.webDriver = new ChromeDriver();
        webDriver.get("https://https://demobank.jaktestowac.pl/pulpit.html");
        String title = webDriver.getTitle();
        System.out.println(title);
        assert title.equals("Demobank - Bankowość Internetowa - Pulpit");

    }



    public void closeWebDriver(){
        webDriver.close();
    }

}
