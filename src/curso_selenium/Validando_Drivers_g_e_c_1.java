package curso_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Validando_Drivers_g_e_c_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Validando chrome driver		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		driver_chrome.get("https://www.google.com");
		
		// Validando firefox driver		
		System.setProperty("webdriver.Fiefox.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver_firefox = new FirefoxDriver();
		driver_firefox.get("https://www.google.com");
		
		// Validando edge driver		
		System.setProperty("webdriver.Edge.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\edgedriver\\edgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.google.com");
		
	}

}
