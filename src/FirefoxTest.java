import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "//Users//rickeyweems//Desktop//Selenium//geckodriver");

        WebDriver driver1 = new FirefoxDriver();


        driver1.get("http://www.google.com");

        System.out.println("Firefox: " + driver1.getTitle());


    }
}
