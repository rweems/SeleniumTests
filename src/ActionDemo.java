import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","//Users//rickeyweems//Desktop//Selenium//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']")))
                .moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")))
                .click().keyDown(Keys.SHIFT).sendKeys("Hello")
                .build()
                .perform();

    }
}
