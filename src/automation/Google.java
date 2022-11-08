package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PAARI.P\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver ();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement gmail = driver.findElement(By.id("email"));
	
	gmail.sendKeys("paari@gmail.com");
	
WebElement password = driver.findElement(By.name("pass"));
	
	password.sendKeys("1001");
	
	WebElement login = driver.findElement(By.name("login"));
	
	login.click();
	
	}

}
