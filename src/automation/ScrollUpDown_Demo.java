package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown_Demo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PAARI.P\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
		
	//js.executeScript("arguments[0].click();",findElement);
	//js.executeScript("arguments[0].scrollIntoView();",findElement);
		
		js.executeScript("window.scrollBy(0,4000);");
		
		
		
		
	}

}
