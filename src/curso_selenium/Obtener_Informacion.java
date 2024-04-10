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

public class Obtener_Informacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Edge.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\edgedriver\\edgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.amazon.com/");
		
		//Regresa un valor booleano si el elemento se ha mostrado
		boolean deliverivisible = driver_edge.findElement(By.id("glow-ingress-line1")).isDisplayed();
		System.out.println(deliverivisible);
		
		//Regresa un valor booleano si el elemento esta disponible
		boolean searchbox = driver_edge.findElement(By.id("twotabsearchtextbox")).isEnabled();
		System.out.println(searchbox);
		
		//Regresa verdadero o falso si se selecciono el checkbox, input, radio button, etc.
		driver_edge.findElement(By.id("icp-nav-flyout")).click();
		driver_edge.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i")).click();
		boolean lenseleccionado = driver_edge.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[1]/div[1]/div[3]")).isSelected();
		System.out.println(lenseleccionado);
		
		
	}

}
