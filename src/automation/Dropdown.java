package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PAARI.P\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		Select s = new Select(drop);
		
		s.selectByVisibleText("yellow");

		
		
	}

}
