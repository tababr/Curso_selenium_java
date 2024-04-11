package curso_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

public class Navegacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\chromeDriver\\chromeDriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		driver_chrome.get("https://www.amazon.com/");

	}

}
