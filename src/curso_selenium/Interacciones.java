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

public class Interacciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Edge.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\edgedriver\\edgedriver.exe");
		WebDriver driver_firefox = new FirefoxDriver();
		driver_firefox.get("https://www.amazon.com");
		
		//Send keys
		driver_firefox.findElement(By.id("twotabsearchtextbox")).sendKeys("Nintendo switch");
		
		//clear
		driver_firefox.findElement(By.id("twotabsearchtextbox")).clear();
		
		//Click()
		driver_firefox.findElement(By.id("nav-hamburger-menu")).click();
	}

}
