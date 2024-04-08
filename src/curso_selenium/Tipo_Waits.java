package curso_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

public class Tipo_Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Edge.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\edgedriver\\edgedriver.exe");
		WebDriver driver_firefox = new FirefoxDriver();
		
		//Implicit wait
		//driver_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver_firefox.get("https://www.google.com");
		//driver_firefox.findElement(By.className("Gdd5U"));
		
		//Explicit wait
		//driver_firefox.get("https://www.google.com");
		//WebElement image = driver_firefox.findElement(By.className("gLFyf"));
		//Wait<WebDriver> wait = new WebDriverWait(driver_firefox, Duration.ofSeconds(5));
		//wait.until(imageshow -> image.isDisplayed());
		//driver_firefox.findElement(By.className("gLFyf")).sendKeys("selenium");
		
		//Fluent wait
		driver_firefox.get("https://www.google.com");
		WebElement image = driver_firefox.findElement(By.className("gLFyf"));
		Wait<WebDriver> wait = new FluentWait(driver_firefox)
				.withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(ElementNotInteractableException.class);
		wait.until(d -> {
			image.sendKeys("selenium");
			return true;
		});
	}

}
