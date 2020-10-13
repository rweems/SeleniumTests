import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

        // invoke .exe file
        System.setProperty("webdriver.chrome.driver", "//Users//rickeyweems//Desktop/Selenium//chromedriver");

        //create driver object for specific browser
        WebDriver driver = new ChromeDriver();


        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("This is my first code");
        driver.findElement(By.name("pass")).sendKeys("1234");
        driver.findElement(By.linkText("Forgot Password?")).click();

        System.out.println("Chrome: " + driver.getTitle());




    }
}
