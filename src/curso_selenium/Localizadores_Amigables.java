package curso_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Localizadores_Amigables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Edge.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\edgedriver\\edgedriver.exe");
		WebDriver driver_firefox = new FirefoxDriver();
		driver_firefox.get("https://www.google.com");
		
		//Encontrando elemento ubicado a la izquierda de otro elemento
		//driver_firefox.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_h"))).click();
		
		//Encontrando elemento ubicado a la derecha de otro elemento
		//driver_firefox.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.linkText("Gmail"))).click();
		
		//Encontrando elemento concatenando
		driver_firefox.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_h")).toLeftOf(By.linkText("Gmail"))).click();
		
		driver_firefox.close();

	}

}
