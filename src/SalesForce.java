import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","//Users//rickeyweems//Desktop//Selenium//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("pass");

        //both give error - compound classes not accepted
        //driver.findElement(By.className(".button.r4.wide.primary")).click();
        //driver.findElement(By.className("button r4 wide primary")).click();

        driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();

    }
}

