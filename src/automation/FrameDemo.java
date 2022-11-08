package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PAARI.P\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement findframe = driver.findElement(By.xpath("//input[@type='text']"));
		findframe.sendKeys("Paari");
		
		driver.switchTo().defaultContent();
		
		WebElement findelement1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		findelement1.click();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		WebElement findframe1 = driver.findElement(By.xpath("//input[@type='text']"));
		
		findframe1.sendKeys("Guru");
		
		driver.switchTo().defaultContent();
		
		
		
	}

}
