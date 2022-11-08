package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingDemo {

	public static void main (String []args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PAARI.P\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
	}
}
