import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","//Users//rickeyweems//Desktop//Selenium//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("");
    }
}
