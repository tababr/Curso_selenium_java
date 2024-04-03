package curso_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Metodos_Basicos_Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\chromedrive\\chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		//Método básico 1, get = nos abre la página requerida
		driver_chrome.get("https://www.google.com");
		
		//Método básico 2, gettitle() = nos trae el titulo de la página actual
		System.out.println(driver_chrome.getTitle());
		
		//Método básico 3, getCurrentUrl() = muestra la dirección actual de la página
		System.out.println(driver_chrome.getCurrentUrl());
		
		//Método básico 4, .close() = cierra el navegador
		//driver_chrome.close();
		
		//Método básico 5, .quit() = termina la sección del driver
		driver_chrome.quit();
		
		//--//
			
		System.setProperty("webdriver.Fiefox.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver_firefox = new FirefoxDriver();
		
		driver_firefox.get("https://www.google.com");
				
		System.out.println(driver_firefox.getTitle());
				
		System.out.println(driver_firefox.getCurrentUrl());
				
		//driver_firefox.close();
				
		driver_firefox.quit();
				
		//--//
		
		System.setProperty("webdriver.Edge.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\edgedriver\\edgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		
		driver_edge.get("https://www.google.com");
		
		System.out.println(driver_edge.getTitle());
		
		System.out.println(driver_edge.getCurrentUrl());
				
		driver_edge.close();
				
		//driver_edge.quit();
;
	}

}
