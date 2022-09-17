import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

wepackage selinium_maven_project;

public class assisgnment_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://us.megabus.com/account-management/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("/html/body/main/div/mb-app/mb-login-page/div/div/div/ul/li[2]/a").Click();
	if (driver.findElement(By.xpath("//*[@id=\"signup\"]")).isEnabled()) 
	{System.out.println("the signup button is on enable mode");
	
	
	}else {
		
	} {
		System.out.println("sign up button is on disabled mode");
	}
		
	}
		
	}
		