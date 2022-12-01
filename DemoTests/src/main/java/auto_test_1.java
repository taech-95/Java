import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_test_1 {


    public static void main(String[] args) {
        MainTests tests = new MainTests();
        tests.testDemoLogin();
        tests.testDemoPulpit();
        tests.closeWebDriver();
    }
}
