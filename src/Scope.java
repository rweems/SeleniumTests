import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","//Users//rickeyweems//Desktop//Selenium//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qaclickacademy.com/practice.php");

        //count all links on page
        System.out.println(driver.findElements(By.cssSelector("a")).stream().count());
        System.out.println(driver.findElements(By.tagName("a")).size());


        //count links in footer
        System.out.println(driver.findElements(By.cssSelector("#gf-BIG a")).size());

        WebElement footerElement = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerElement.findElements(By.tagName("a")).size());

        //count links in first column of footer
        WebElement columnElements = footerElement.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnElements.findElements(By.tagName("a")).size());


        // attempt to open links in new tab
        for(int i = 1; i < columnElements.findElements(By.tagName("a")).size(); i++){
            String clinkOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
//            String linkText = columnElements.findElements(By.tagName("a")).get(i).getText();
//            columnElements.findElement(By.linkText(linkText)).sendKeys(clinkOnLink);

            columnElements.findElements(By.tagName("a")).get(i).sendKeys(clinkOnLink);
            Thread.sleep(5000L);
        }
    }
}
