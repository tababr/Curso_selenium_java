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

public class Obtener_Informacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\chromeDriver\\chromeDriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		driver_chrome.get("https://www.amazon.com/");
		
		//Regresa un valor booleano si el elemento se ha mostrado
		boolean deliverivisible = driver_chrome.findElement(By.id("glow-ingress-line1")).isDisplayed();
		System.out.println(deliverivisible);
		
		//Regresa un valor booleano si el elemento esta disponible
		boolean searchbox = driver_chrome.findElement(By.id("twotabsearchtextbox")).isEnabled();
		System.out.println(searchbox);
		
		//Regresa verdadero o falso si se selecciono el checkbox, input, radio button, etc
		driver_chrome.findElement(By.id("icp-nav-flyout")).click();
		driver_chrome.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i")).click();
		boolean lenseleccionado = driver_chrome.findElement(By.xpath("//*[@id=\\\"icp-language-settings\\\"]/div[3]/div/label/input")).isSelected();
		System.out.println(lenseleccionado);
		
		//Regresa el tagname del elemento input, spam, div, i, etc.
		String nametag = driver_chrome.findElement(By.id("twotabsearchtextbox")).getTagName();
		System.out.println(nametag);
		
		//Obtener ubicación y tamaño de los componentes
		Rectangle imgamazon = driver_chrome.findElement(By.id("nav-logo-sprites")).getRect();
		System.out.println(imgamazon.getX());
		System.out.println(imgamazon.getY());
		System.out.println(imgamazon.getWidth());
		System.out.println(imgamazon.getHeight());
		
		//Regresa los valores CSS
		String valorcss = driver_chrome.findElement(By.className("a-button.inner")).getCssValue("box-shadow");
		System.out.println(valorcss);
		
		//Regresa texto del componente
		String texto = driver_chrome.findElement(By.id("icp-language-translation-text")).getText();
		System.out.println(texto);
	}

}
