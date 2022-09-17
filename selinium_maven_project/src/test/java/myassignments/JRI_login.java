package myassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JRI_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.name("txtUserName")).sendKeys("naila@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("asdfg");
		driver.findElement(By.name("txtCaptcha")).sendKeys("1234");
		driver.findElement(By.name("imgbtnSignin")).click();

	}

}
