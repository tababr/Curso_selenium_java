package curso_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Localizadores_Tradicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Edge.driver", "C:\\Users\\User\\OneDrive - sport enlace sas\\Documents\\Drivers\\edgedriver\\edgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.google.com");
		
		//Encontrando elemento por id
		driver_edge.findElement(By.id("APjFqb"));
		
		//Encontrar elemento por class name
		driver_edge.findElement(By.className("gNO89b"));
		
		//Encontrar elemento por name
		driver_edge.findElement(By.name("btnI"));
		
		//Encontrar elemento por link text
		driver_edge.findElement(By.linkText("Sobre Google"));
		
		//Encontrar elemento por link text parcial
		driver_edge.findElement(By.partialLinkText("Sobre Goo"));
		
		//Encontrar elemento por xpath
		driver_edge.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/a[2]"));
		
		driver_edge.close();
		

	}

}
