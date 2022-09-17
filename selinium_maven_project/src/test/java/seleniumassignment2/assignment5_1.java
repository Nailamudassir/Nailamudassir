package seleniumassignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindActiveElement;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriverManager = new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");

Thread.sleep(2000);

new Select Driver(FindActiveElement(By.id("speed")) ).selectByVisibleText("fast");
new Select Driver(FindActiveElement(By.id("files")) ).selectByVisibleText("PDFfiles");
new Select Driver(FindActiveElement(By.id("numbers")) ).selectByVisibleText("4");
new Select Driver(FindActiveElement(By.id("products")) ).selectByVisibleText("Iphone");
new Select Driver(FindActiveElement(By.id("animals")) ).selectByVisibleText("Baby cat");


	}

}
