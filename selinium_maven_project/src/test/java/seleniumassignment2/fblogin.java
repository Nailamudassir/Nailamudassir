package seleniumassignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fblogin {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("hiall@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dsbsda");
		driver.findElement(By.name("login")).click(); 
			

	}

}
