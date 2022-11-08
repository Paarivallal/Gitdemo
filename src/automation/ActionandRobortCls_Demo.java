package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionandRobortCls_Demo {
	
	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\PAARI.P\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions (driver);

		WebElement d  = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
          a.doubleClick(d).build().perform();
          
     
        
          
          
          
         
          
          

	}

}
